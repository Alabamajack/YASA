#include "kernel.h"
#include "kernel_id.h"
#include "ecrobot_interface.h"
#include "ecrobot_bluetooth.h"

DeclareTask(InitHook);
DeclareTask(SchussanlagenTask);



//Schussanlage_Runnable
void Schussanlage_Runnable()
{
Bla Bla runnable
pi pa po
	lalelu

}

TASK(InitHook)
{
	ecrobot_init_sonar_sensor(NXT_PORT_S0);
	i2c_enable(NXT_PORT_S1);
}

TASK(SchussanlagenTask)
{
	while(1)
	{
		Schussanlage_Runnable();
	}
	TerminateTask();
}
