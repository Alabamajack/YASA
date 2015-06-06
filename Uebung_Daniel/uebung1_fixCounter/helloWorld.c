#include "kernel.h"
#include "kernel_id.h"
#include "ecrobot_interface.h"

DeclareTask(Main);
DeclareTask(one);
DeclareTask(two);
DeclareTask(three);
DeclareTask(Monitor);

DeclareCounter(finalCountdown);

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
	// display_string("Hello World!"); 		/* Ausgabe in Displayspeicher*/
	// display_update(); 						/* Anzeige aktualisieren */
	
	// ActivateTask(Monitor);
	// ActivateTask(one);
	// ActivateTask(three);
	
	// ChainTask(two);
	
	ecrobot_sound_tone(1000,2,70);
	
	// ecrobot_set_motor_speed(NXT_PORT_B,50); /* Motor an mit 50% Power */
	// systick_wait_ms(3000); 					/* 3000ms warten */
	// ecrobot_set_motor_speed(NXT_PORT_B,0); 	/* Motor aus */
	TerminateTask(); 						/* Task beenden */
}

TASK(one)
{
	myPrintln("one");
	TerminateTask();
}

TASK(two)
{
	myPrintln("two");
	TerminateTask();
}

TASK(three)
{
	myPrintln("three");
	TerminateTask();
}

TASK(Monitor)
{
	myPrintln("Monitor");
	TerminateTask();
}