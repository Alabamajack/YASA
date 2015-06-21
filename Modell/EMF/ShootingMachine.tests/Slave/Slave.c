#include "kernel.h"
#include "kernel_id.h"
#include "ecrobot_interface.h"
#include "ecrobot_bluetooth.h"

DeclareTask(Output_Task);



//Output_runnable
void Output_runnable()
{
Bla Bla runnable
pi pa po
	lalelu

}

TASK(Output_Task)
{
	while(1)
	{
		Output_runnable();
	}
	TerminateTask();
}
