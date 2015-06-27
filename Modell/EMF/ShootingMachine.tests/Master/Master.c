#include "kernel.h"
#include "kernel_id.h"
#include "ecrobot_interface.h"
#include "ecrobot_bluetooth.h"
#include "YASA_generated_variables.h"

DeclareTask(InitHook);
DeclareTask(TASK_BT_INTERFACE_READER);
DeclareTask(TASK_BT_INTERFACE_WRITER);
DeclareTask(BT_IMPLIZIT_MASTER);
DeclareEvent(BT_HAS_RECEIVED_PACKAGE);
DeclareEvent(BT_SEND_MY_MESSAGE)
DeclareTask(SchussanlagenTask);



//Schussanlage_Runnable
void Schussanlage_Runnable()
{
asdjkahsfdjklahsfjksdhfg+
sdfgdukfgklsfdgjklg

}

TASK(InitHook)
{
}

//bekommt Nachrichten vom BT und verteilt diese an die Ports
TASK(TASK_BT_INTERFACE_READER)
{
    U8 localBuffer[BT_PACKAGE_SIZE];
    U8 id;
	U8* locBuffer_ptr = localBuffer;
	EventMaskType event;
    while(1)
    {
	
    }
    Terminate_Task();
}
//bekommt Nachrichten von Ports und verschickt diese über BT
TASK(TASK_BT_INTERFACE_WRITER)
{
    U8 localBuffer[BT_PACKAGE_SIZE];
    U8 id;
	EventMaskType event;
	U8* transmit_pack_ptr = BT_transmit_package;
    while(1)
    {
		BT_DYNAMIC_WRITER_CODE;
    }

    TerminateTask();
}

void ecrobot_device_initialize()
{
	const U8 slaveAddr[7] = {BT_SLAVE_ADDRESS};
	ecrobot_init_bt_master(slaveAddr,"YASA");
}

TASK(BT_IMPLIZIT_MASTER)
{
	U8 lastValue[BT_PACKAGE_SIZE];
	EventMaskType bt_event;
	while(1)
	{
		if(ecrobot_read_bt_packet(&lastValue, BT_PACKAGE_SIZE) > 0)
		{
			BT_receive_package = lastValue;
			SetEvent(TASK_BT_INTERFACE_READER, BT_HAS_RECEIVED_PACKAGE);
		}
		if(GetEvent(BT_IMPLIZIT_MASTER, &bt_event)
		{
			ClearEvent(bt_event);
			ecrobot_send_bt_packet(&BT_transmit_package, BT_PACKAGE_SIZE);
		}
	}
	Terminate_Task();
}

TASK(SchussanlagenTask)
{
	while(1)
	{
		Schussanlage_Runnable();
	}
	TerminateTask();
}
