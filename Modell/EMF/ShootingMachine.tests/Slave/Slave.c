#include "kernel.h"
#include "kernel_id.h"
#include "ecrobot_interface.h"
#include "ecrobot_bluetooth.h"
#include "YASA_generated_variables.h"

DeclareTask(InitHook);
DeclareTask(TASK_BT_INTERFACE_READER);
DeclareTask(TASK_BT_INTERFACE_WRITER);
DeclareTask(BT_IMPLIZIT_SLAVE);
DeclareEvent(BT_HAS_RECEIVED_PACKAGE);
DeclareEvent(BT_SEND_MY_MESSAGE)
DeclareTask(Trigger);

DeclareTask(StartTrigger);



//Ab hier werden alle Events und variablen zur Kommunikation eingefuegt:
DeclareEvent(RTE_Schussanlage_Trigger_GetValue_Event_In_EVENT);
DeclareEvent(RTE_Trigger_StartTrigger_GetValue_Event_In_EVENT);

inline std_return RTE_Trigger_Schussanlage_SetEvent_Out()
{
	SetEvent(TASK_BT_INTERFACE_WRITER, RTE_Schussanlage_Trigger_GetValue_Event_In_EVENT);
}

inline std_return RTE_Trigger_StartTrigger_GetValue_Event_In(uint8_t *a)
{
	EventMaskType event = 0;
	GetEvent(Trigger,&event);
	if(event & RTE_Trigger_StartTrigger_GetValue_Event_In_EVENT)
	{
		ClearEvent(RTE_Trigger_StartTrigger_GetValue_Event_In_EVENT);
		*a= 1;
	}
	else
		*a= 0;
	}
}

//Trigger_Runnable
void Trigger_Runnable()
{
asdjkahsfdjklahsfjksdhfg+
sdfgdukfgklsfdgjklg

}

//StartTrigger_Runnable
void StartTrigger_Runnable()
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

TASK(BT_IMPLIZIT_SLAVE)
{
	U8 lastValue[BT_PACKAGE_SIZE];
	EventMaskType bt_event;
	while(ecrobot_get_bt_status()!=BT_STREAM)
	{
		#ifdef __DEBUG__
		display_goto_xy(0,0);
		display_int(ecrobot_get_bt_status(), 0);
		display_update();
		#endif
		ecrobot_init_bt_slave("YASA");
	}

	while(1)
	{
		if(ecrobot_read_bt_packet(&lastValue, BT_PACKAGE_SIZE) > 0)
		{
			BT_receive_package = lastValue;
			SetEvent(TASK_BT_INTERFACE, BT_HAS_RECEIVED_PACKAGE);
		}
		if(GetEvent(BT_IMPLIZIT_SLAVE, &bt_event)
		{
			ClearEvent(bt_event);
			ecrobot_send_bt_packet(&BT_transmit_package, BT_PACKAGE_SIZE);
		}
	}
	TerminateTask();
}

TASK(Trigger)
{
	while(1)
	{
		Trigger_Runnable();
	}
	TerminateTask();
}
TASK(StartTrigger)
{
	while(1)
	{
		StartTrigger_Runnable();
	}
	TerminateTask();
}
