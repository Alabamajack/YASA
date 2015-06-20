#include "kernel.h"
#include "kernel_id.h"
#include "ecrobot_interface.h"
#include "ecrobot_bluetooth.h"

DeclareTask(Main);

DeclareAlarm(Alarm1);
DeclareCounter(Alarm1);

DeclareTask(Schussanlage);

DeclareAlarm(Alarm2);
DeclareCounter(Alarm2);

DeclareEvent(evt_shoot);
DeclareEvent(evt_abort);

\\runnable1
void runnable1()
{
1
	2
		3
			4

}

TASK(Main)
{
runnable1();
TerminateTask();
}

TASK(Schussanlage)
{
TerminateTask();
}

