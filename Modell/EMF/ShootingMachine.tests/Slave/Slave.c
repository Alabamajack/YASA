#include "kernel.h"
#include "kernel_id.h"
#include "ecrobot_interface.h"
#include "ecrobot_bluetooth.h"

DeclareTask(InitHook);
DeclareTask(Trigger);



//Trigger_Runnable
void Trigger_Runnable()
{
Bla Bla runnable
pi pa po
	lalelu

}

TASK(InitHook)
{
}

TASK(Trigger)
{
	while(1)
	{
		Trigger_Runnable();
	}
	TerminateTask();
}
