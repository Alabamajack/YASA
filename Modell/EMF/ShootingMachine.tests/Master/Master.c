#include "kernel.h"
#include "kernel_id.h"
#include "ecrobot_interface.h"
#include "ecrobot_bluetooth.h"
#include "YASA_generated_variables.h"
#include "YASA_global_variables.h"
#include "YASA_types.h"
#include <string.h>

DeclareTask(InitHook);
DeclareTask(TASK_BT_INTERFACE_READER);
DeclareTask(TASK_BT_INTERFACE_WRITER);
DeclareTask(BT_IMPLIZIT_MASTER);
DeclareTask(BT_IMPLIZIT_MASTER2);
DeclareEvent(BT_HAS_RECEIVED_PACKAGE);
DeclareEvent(BT_SEND_MY_MESSAGE);
DeclareTask(SchussanlagenTask);

DeclareTask(Output);



//Ab hier werden alle Events und variablen zur Kommunikation eingefuegt:
DeclareEvent(RTE_Trigger_GetValue_Receiver_In_EVENT);
U8 RTE_Trigger_GetValue_Receiver_In_SPEICHER;
DeclareEvent(RTE_Output_GetValue_Receiver_In_EVENT);
U8 RTE_Output_GetValue_Receiver_In_SPEICHER;

inline std_return RTE_Schussanlage_SendMessage_Sender_Out(char *a)
{
	strcpy(COMSERVICE_transmit_package[0] ,a);
	SetEvent(TASK_BT_INTERFACE_WRITER, RTE_Trigger_GetValue_Receiver_In_EVENT);
	strcpy(RTE_Output_GetValue_Receiver_In_SPEICHER,a);
	SetEvent(Output, RTE_Output_GetValue_Receiver_In_EVENT);
	return 0;
}

inline std_return RTE_Output_GetValue_Receiver_In(char *a)
{
	EventMaskType event = 0;
	GetEvent(Output,&event);
	if(event & RTE_Output_GetValue_Receiver_In_EVENT)
	{
		ClearEvent(RTE_Output_GetValue_Receiver_In_EVENT);
		strcpy(a,RTE_Output_GetValue_Receiver_In_SPEICHER);
	}
	else
	{
		strcpy(a,"");
	}
	return 0;
}

//Schussanlage_Runnable
void Schussanlage_Runnable()
{
asdjkahsfdjklahsfjksdhfg+
sdfgdukfgklsfdgjklg

}

//Output_Runnable
void Output_Runnable()
{
asdjkahsfdjklahsfjksdhfg+
sdfgdukfgklsfdgjklg

}

void user_1ms_isr_type2(void){}

TASK(InitHook)
{
	TerminateTask();
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
    TerminateTask();
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

//kriegt Events von der Comschicht
//bekommt die höchste Priorität im gesamten Prozess
//in extra Tasks aufgeteilt um Starvation zu vermeiden
TASK(BT_IMPLIZIT_MASTER)
{
	while(1)
	{
		WaitEvent(BT_SEND_MY_MESSAGE);
		ClearEvent(BT_SEND_MY_MESSAGE);
		ecrobot_send_bt_packet(&BT_transmit_package, BT_PACKAGE_SIZE);
	}
	TerminateTask();
}

//pullt ständig aufm bluetooth
// sehr niedrige Priorität, kommt also nur dran, wenn grad nix anderes zu tun ist
TASK(BT_IMPLIZIT_MASTER2)
{
	U8 lastValue[BT_PACKAGE_SIZE];
	while(1)
	{
		if(ecrobot_read_bt_packet(&lastValue, BT_PACKAGE_SIZE) > 0)
		{
			strcpy(BT_receive_package, lastValue);
			SetEvent(TASK_BT_INTERFACE_READER, BT_HAS_RECEIVED_PACKAGE);
		}
	}
	
	TerminateTask();
}

TASK(SchussanlagenTask)
{
	while(1)
	{
		Schussanlage_Runnable();
	}
	TerminateTask();
}
TASK(Output)
{
	while(1)
	{
		Output_Runnable();
	}
	TerminateTask();
}
