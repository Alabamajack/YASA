#include "kernel.h"
#include "kernel_id.h"
#include "ecrobot_interface.h"
#include "ecrobot_bluetooth.h"
#include "YASA_generated_variables.h"
#include "YASA_global_variables.h"
#include "YASA_types.h"

DeclareTask(InitHook);
DeclareTask(TASK_BT_INTERFACE_READER);
DeclareTask(TASK_BT_INTERFACE_WRITER);
DeclareTask(BT_IMPLIZIT_SLAVE);
DeclareEvent(BT_HAS_RECEIVED_PACKAGE);
DeclareEvent(BT_SEND_MY_MESSAGE);
DeclareTask(Trigger_Task);



//Ab hier werden alle Events und variablen zur Kommunikation eingefuegt:
DeclareEvent(RTE_Schussanlage_Trigger_GetValue_Event_In_EVENT);

inline std_return RTE_Trigger_Schussanlage_SetEvent_Out()
{
	SetEvent(TASK_BT_INTERFACE_WRITER, RTE_Schussanlage_Trigger_GetValue_Event_In_EVENT);
}

//Trigger_Runnable
void Trigger_Runnable()
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
		WaitEvent(BT_HAS_RECEIVED_PACKAGE); // auf Event von BT-Handler warten
		ClearEvent(BT_HAS_RECEIVED_PACKAGE);
		strcpy(localBuffer, BT_receive_package); // Wert aus BT-Handler zwischenspeichern
		id = *locBuffer_ptr; // die id extrahieren
		locBuffer_ptr++; // auf die zweite Stelle speichern
		
		BT_DYNAMIC_READER_CODE;
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
		GetEvent(BT_IMPLIZIT_SLAVE, &bt_event);
		if(ecrobot_read_bt_packet(&lastValue, BT_PACKAGE_SIZE) > 0)
		{
			strcpy(BT_receive_package, lastValue);
			SetEvent(TASK_BT_INTERFACE_READER, BT_HAS_RECEIVED_PACKAGE);
		}
		if(bt_event & BT_SEND_MY_MESSAGE)
		{
			ClearEvent(BT_SEND_MY_MESSAGE);
			ecrobot_send_bt_packet(&BT_transmit_package, BT_PACKAGE_SIZE);
		}
	}
	TerminateTask();
}

TASK(Trigger_Task)
{
	while(1)
	{
		Trigger_Runnable();
	}
	TerminateTask();
}
