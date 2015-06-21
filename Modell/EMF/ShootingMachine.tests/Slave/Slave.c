#include "kernel.h"
#include "kernel_id.h"
#include "ecrobot_interface.h"
#include "ecrobot_bluetooth.h"

DeclareTask(Output_Task);



\\Output_runnable
void Output_runnable()
{
das ist mein runnable code

}

TASK(Output_Task)
{
Output_runnable();
TerminateTask();
}

