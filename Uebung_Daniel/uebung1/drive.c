#include "kernel.h"
#include "kernel_id.h"
#include "ecrobot_interface.h"

int counterValue = 100;
int direction = 0;
int driverButtonLastState = 0;
int turnButtonLastState = 0;

DeclareTask(Main);
DeclareTask(checkDriveButton);
DeclareTask(checkTurnButton);
DeclareTask(ReverseDir);
DeclareTask(Disp);

DeclareEvent(evt_drive);
DeclareEvent(evt_turn);
DeclareEvent(evt_disp);

DeclareCounter(finalCountdown);
DeclareAlarm(driveAlarm);
DeclareAlarm(turnAlarm);

int ReadPort_direction()
{
	return direction;
}

void WritePort_direction(U8 value)
{
	direction = value;
}

void WaitTriggerPort_direction()
{
	WaitEvent(evt_turn);
}

void WriteTriggerPort_direction()
{
	SetEvent(ReverseDir, evt_turn);
}


void user_1ms_isr_type2(void)
{
	StatusType ercd;
	ercd = SignalCounter( finalCountdown );
	if( ercd != E_OK )
	{
		ShutdownOS( ercd );
	}
}

void myPrintln(const char *s)
{
	static int y = 0;
	display_goto_xy(0,y);
	display_string(s);
	display_update();
	y++;
}

TASK(Main)
{
	// myPrintln("Main started");
	while(true)
	{
		WaitEvent(evt_drive);
		
		EventMaskType driveEvent;
		
		GetEvent(Main, &driveEvent);
		WaitEvent(driveEvent);
			
		if ( ReadPort_direction() == 0)
		{
			ecrobot_set_motor_speed(NXT_PORT_A,35); /* Motor an mit 35% Power */
			ecrobot_set_motor_speed(NXT_PORT_B,35); /* Motor an mit 35% Power */
			systick_wait_ms(1000); 					/* 1000ms warten */
			ecrobot_set_motor_speed(NXT_PORT_A,0); 	/* Motor aus */
			ecrobot_set_motor_speed(NXT_PORT_B,0); 	/* Motor aus */
		}
		else
		{
			ecrobot_set_motor_speed(NXT_PORT_A,-35); /* Motor an mit -35% Power */
			ecrobot_set_motor_speed(NXT_PORT_B,-35); /* Motor an mit -35% Power */
			systick_wait_ms(1000); 					/* 1000ms warten */
			ecrobot_set_motor_speed(NXT_PORT_A,0); 	/* Motor aus */
			ecrobot_set_motor_speed(NXT_PORT_B,0); 	/* Motor aus */
		}
		ClearEvent(evt_drive);
		
	
	}
	TerminateTask(); 						/* Task beenden */
}

TASK(ReverseDir)
{
	// EventMaskType turnEvent;
	// myPrintln("ReverseDir started");
	while(true)
	{
		//GetEvent(ReverseDir, &turnEvent);
		WaitTriggerPort_direction();
		//myPrintln("DebugReverseDir");
			
		// myPrintln(ReadPort_direction());
		WritePort_direction(!ReadPort_direction());
		SetEvent(Disp, evt_disp);
		ClearEvent(evt_turn);
	}
	TerminateTask();
}

TASK(Disp)
{
	// EventMaskType dispEvent;
	myPrintln("Disp started");
	myPrintln("Vorwaerts");
	while(true)
	{
		// GetEvent(ReverseDir, &turnEvent);
		WaitEvent(evt_disp);
		myPrintln("DebugReverseDir");
			
		if ( !direction )
		{
			myPrintln("Vorwaerts");
		}
		else
		{
			myPrintln("Rueckweaerts");
		}
		ClearEvent(evt_disp);
	}
	TerminateTask();
}

TASK(checkDriveButton)
{
	//myPrintln("Drive started");
	int currentStatus = ecrobot_get_touch_sensor(NXT_PORT_S1);
	
	if ( currentStatus != driverButtonLastState && currentStatus != 0)
	{
		// myPrintln("Event drive set");
		SetEvent(Main, evt_drive);
	}
	
	driverButtonLastState = currentStatus;
	
	TerminateTask(); 
}

TASK(checkTurnButton)
{
	// myPrintln("Turn started");
	int currentStatus = ecrobot_get_touch_sensor(NXT_PORT_S4);
	
	if ( currentStatus != turnButtonLastState && currentStatus != 0)
	{
		// myPrintln("Event turn set");
		WriteTriggerPort_direction();
	}
	
	turnButtonLastState = currentStatus;
	
	TerminateTask(); 
}

