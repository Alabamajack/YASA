#include "kernel.h"
#include "kernel_id.h"
#include "ecrobot_interface.h"
#include "ecrobot_bluetooth.h"

int counterValue = 100;
U8 direction = 0;
int driverButtonLastState = 0;
int turnButtonLastState = 0;
U8 tmpEvt = 0;
U8 value = 0;

DeclareTask(Main);
DeclareTask(Disp);

DeclareEvent(evt_disp);

void myPrintln(const char *s)
{
	static int y = 0;
	display_goto_xy(0,y);
	display_string(s);
	display_update();
	// y++;
}

void myPrintHex(int s)
{
	static int z = 1;
	display_goto_xy(0,z);
	display_hex(s,2);
	display_update();
}

int ReadPort_direction()
{
	// ecrobot_read_bt_packet(&direction, 4);
	return direction;
}

void WaitTriggerPort_direction()
{
	// WaitEvent(evt_disp);
	while(1)
	{
		U8 lastValue = value;
		if ( ecrobot_read_bt_packet(&value, 4) > 0)
		{
			ecrobot_sound_tone(440, 50, 50);
			myPrintHex(value);
			direction = value;
			break;
		}
		// ecrobot_sound_tone(440, 50, 50);
		// systick_wait_ms(100); 
		// display_clear(1);
		//myPrintHex(value);
		// if(value)
			// break;
	}
}

void user_1ms_isr_type2(void)
{
	// StatusType ercd;
	// ercd = SignalCounter( finalCountdown );
	// if( ercd != E_OK )
	// {
		// ShutdownOS( ercd );
	// }
}

TASK(Main)
{
	
	TerminateTask(); 						/* Task beenden */
}


TASK(Disp)
{
	while(ecrobot_get_bt_status()!=BT_STREAM)
	{
		ecrobot_init_bt_slave("AUTOSAR_VL");
	}
	
	EventMaskType dispEvent;
	// myPrintln("Disp started");
	myPrintln("Vorwaerts");
	while(true)
	{
		//GetEvent(ReverseDir, &turnEvent);
		WaitTriggerPort_direction();
		//myPrintln("DebugReverseDir");
			
		if ( !ReadPort_direction() )
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


