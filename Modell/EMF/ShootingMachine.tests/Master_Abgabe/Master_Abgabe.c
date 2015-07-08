#include "kernel.h"
#include "kernel_id.h"
#include "ecrobot_interface.h"
#include "ecrobot_bluetooth.h"
#include "YASA_generated_variables.h"
#include "YASA_global_variables.h"
#include "YASA_types.h"
#include "YASA_RTEAPI.h"
#include <string.h>

DeclareTask(InitHook);
DeclareTask(TASK_BT_INTERFACE_READER);
DeclareTask(TASK_BT_INTERFACE_WRITER);
DeclareTask(BT_IMPLIZIT_MASTER);
DeclareTask(BT_IMPLIZIT_MASTER2);
DeclareEvent(BT_HAS_RECEIVED_PACKAGE);
DeclareEvent(BT_SEND_MY_MESSAGE);
DeclareTask(Manager);

DeclareTask(Output);



//Ab hier werden alle Events und variablen zur Kommunikation eingefuegt:
DeclareEvent(RTE_Manager_Input_GetValue_Event_In_EVENT);
DeclareEvent(RTE_Output_Manager_GetValue_Receiver_In_EVENT);
U8 RTE_Output_Manager_GetValue_Receiver_In_SPEICHER[MAX_MESSAGE_LENGHT];

inline std_return RTE_Manager_Output_SetValue_Sender_Out(char *a)
{
	strcpy(RTE_Output_Manager_GetValue_Receiver_In_SPEICHER,a);
	SetEvent(Output, RTE_Output_Manager_GetValue_Receiver_In_EVENT);
	return 0;
}

inline std_return RTE_Manager_Input_GetValue_Event_In(char *a)
{
	WaitEvent(RTE_Manager_Input_GetValue_Event_In_EVENT);
	ClearEvent(RTE_Manager_Input_GetValue_Event_In_EVENT);
	return 0;
}

inline std_return RTE_Output_Manager_GetValue_Receiver_In(char *a)
{
	WaitEvent(RTE_Output_Manager_GetValue_Receiver_In_EVENT);
	ClearEvent(RTE_Output_Manager_GetValue_Receiver_In_EVENT);
	strcpy(a,RTE_Output_Manager_GetValue_Receiver_In_SPEICHER);
	return 0;
}
DeclareEvent(BT_IMPLIZIT_MASTER2_EVENT);
//Manager_Code
void Manager_Code()
{
asdjkahsfdjklahsfjksdhfg+
sdfgdukfgklsfdgjklg

}

//Output_Code
void Output_Code()
{
asdjkahsfdjklahsfjksdhfg+
sdfgdukfgklsfdgjklg

}

void user_1ms_isr_type2(void){
	static int a = 0;
 if(a == 10){
	SetEvent(BT_IMPLIZIT_MASTER2, BT_IMPLIZIT_MASTER2_EVENT);a = 0;}
a++;
}

TASK(InitHook)
{
	TerminateTask();
}

//bekommt Nachrichten vom BT und verteilt diese an die Ports
TASK(TASK_BT_INTERFACE_READER)
{
    U8 localBuffer[BT_PACKAGE_SIZE];
    U8 id;
	EventMaskType event;
	
    while(1)
    {
		WaitEvent(BT_HAS_RECEIVED_PACKAGE); // auf Event von BT-Handler warten
		ClearEvent(BT_HAS_RECEIVED_PACKAGE);
		for(int i = 0; i < BT_PACKAGE_SIZE; i++)
			localBuffer[i] = BT_receive_package[i];
		id = localBuffer[0];
		
		BT_DYNAMIC_READER_CODE;
    }
    TerminateTask();
}
//bekommt Nachrichten von Ports und verschickt diese ueber BT
TASK(TASK_BT_INTERFACE_WRITER)
{
    U8 localBuffer[BT_PACKAGE_SIZE];
    U8 id;
	EventMaskType event;
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
		ecrobot_send_bt_packet(BT_transmit_package, BT_PACKAGE_SIZE);
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
		WaitEvent(BT_IMPLIZIT_MASTER2_EVENT);
		ClearEvent(BT_IMPLIZIT_MASTER2_EVENT);
		if(ecrobot_read_bt_packet(lastValue, BT_PACKAGE_SIZE) > 0)
		{
			for(int i = 0; i < BT_PACKAGE_SIZE; i++) {
				BT_receive_package[i] = lastValue[i];
			}
			SetEvent(TASK_BT_INTERFACE_READER, BT_HAS_RECEIVED_PACKAGE);
		}
	}
	
	TerminateTask();
}

TASK(Manager)
{
	while(1)
	{
		Manager_Code();
	}
	TerminateTask();
}
TASK(Output)
{
	while(1)
	{
		Output_Code();
	}
	TerminateTask();
}
