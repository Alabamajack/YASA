#include "kernel.h"
#include "kernel_id.h"
#include "ecrobot_interface.h"
#include "ecrobot_bluetooth.h"

DeclareTask(SchussanlagenTask);



\\Schussanlage_Runnable
void Schussanlage_Runnable()
{
das ist mein runnable code

}

TASK(SchussanlagenTask)
{
Schussanlage_Runnable();
TerminateTask();
}

