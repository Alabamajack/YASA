#include "kernel.h"
#include "kernel_id.h"
#include "ecrobot_interface.h"
#include "ecrobot_bluetooth.h"
#include "YASA_generated_variables.h"
#include "YASA_global_variables.h"

DeclareTask(InitHook);
DeclareTask(TASK_BT_INTERFACE_READER);
DeclareTask(TASK_BT_INTERFACE_WRITER);
DeclareTask(BT_IMPLIZIT_MASTER);
DeclareEvent(BT_HAS_RECEIVED_PACKAGE);
DeclareEvent(BT_SEND_MY_MESSAGE)
DeclareTask(Schussanlagen_Task);



//Ab hier werden alle Events und variablen zur Kommunikation eingefuegt:
DeclareEvent(RTE_Schussanlage_Trigger_GetValue_Event_In_EVENT);

inline std_return RTE_Schussanlage_Trigger_GetValue_Event_In(uint8_t *a)
{
	EventMaskType event = 0;
	GetEvent(Schussanlagen_Task,&event);
	if(event & RTE_Schussanlage_Trigger_GetValue_Event_In_EVENT)
	{
		ClearEvent(RTE_Schussanlage_Trigger_GetValue_Event_In_EVENT);
		*a = 1;
	}
	else
		*a = 0;
	}
}

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
		WaitEvent(BT_HAS_RECEIVED_PACKAGE); // auf Event von BT-Handler warten
		ClearEvent(BT_HAS_RECEIVED_PACKAGE);
		strcpy(localBuffer, BT_receive_package); // Wert aus BT-Handler zwischenspeichern
		id = *locBuffer_ptr; // die id extrahieren
		locBuffer_ptr++; // auf die zweite Stelle speichern
		
		( switch(id){case 0:
		strcpy(COMSERVICE_receive_package[0], locBuffer_ptr);
		SetEvent(Schussanlagen_Task,RTE_Schussanlage_Trigger_GetValue_Event_In_EVENT);
		break;
		}
	);
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
		GetEvent(BT_IMPLIZIT_MASTER, &bt_event);
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

TASK(Schussanlagen_Task)
{
	while(1)
	{
		Schussanlage_Runnable();
	}
	TerminateTask();
}
