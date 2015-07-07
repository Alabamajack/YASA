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
DeclareTask(BT_IMPLIZIT_SLAVE);
DeclareTask(BT_IMPLIZIT_SLAVE2);
DeclareEvent(BT_HAS_RECEIVED_PACKAGE);
DeclareEvent(BT_SEND_MY_MESSAGE);
DeclareTask(Trigger);



//Ab hier werden alle Events und variablen zur Kommunikation eingefuegt:
DeclareEvent(RTE_Trigger_GetValue_Receiver_In_EVENT);
DeclareEvent(RTE_Schussanlage_Trigger_GetValue_Event_In_EVENT);

inline std_return RTE_Trigger_Schussanlage_SetValue_Event_Out()
{
	SetEvent(TASK_BT_INTERFACE_WRITER, RTE_Schussanlage_Trigger_GetValue_Event_In_EVENT);
	return 0;
}

inline std_return RTE_Trigger_GetValue_Receiver_In(char *a)
{
	WaitEvent(RTE_Trigger_GetValue_Receiver_In_EVENT);
	ClearEvent(RTE_Trigger_GetValue_Receiver_In_EVENT);
	for(int i=0; i< MAX_MESSAGE_LENGHT; i++){
		a[i] = COMSERVICE_receive_package[0][i];
	}
	return 0;
}
DeclareEvent(BT_IMPLIZIT_SLAVE2_EVENT);
//Trigger_Runnable
void Trigger_Runnable()
{
systick_wait_ms(5000);
RTE_Trigger_Schussanlage_SetValue_Event_Out();
display_goto_xy(0,1);
display_string("event verschickt");
display_update();
char a[MAX_MESSAGE_LENGHT] = {0};
RTE_Trigger_GetValue_Receiver_In(a);
display_goto_xy(0,0);
display_string(a);
display_update();

}

void user_1ms_isr_type2(void){
	static int a = 0;
 if(a == 10){
	SetEvent(BT_IMPLIZIT_SLAVE2, BT_IMPLIZIT_SLAVE2_EVENT);a = 0;}
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
		
		switch(id){
			case 0:
				for(int i = 0; i < MAX_MESSAGE_LENGHT; i++)
					COMSERVICE_receive_package[0][i] = localBuffer[i+1];
				SetEvent(Trigger,RTE_Trigger_GetValue_Receiver_In_EVENT);
				break;
		}
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
		WaitEvent(RTE_Schussanlage_Trigger_GetValue_Event_In_EVENT );
		GetEvent(TASK_BT_INTERFACE_WRITER, &event);
		if(event & RTE_Schussanlage_Trigger_GetValue_Event_In_EVENT){
			ClearEvent(RTE_Schussanlage_Trigger_GetValue_Event_In_EVENT);
			BT_transmit_package[0] =1;
			for(int i = 0; i < MAX_MESSAGE_LENGHT; i++) 
				BT_transmit_package[i+1] = COMSERVICE_transmit_package[1][i];
			SetEvent(BT_IMPLIZIT_SLAVE,BT_SEND_MY_MESSAGE);
		}

    }
	TerminateTask();
}

TASK(BT_IMPLIZIT_SLAVE)
{

	while(ecrobot_get_bt_status()!=BT_STREAM)
	{
		display_goto_xy(0,1);
		display_int(ecrobot_get_bt_status(), 0);
		display_update();
		ecrobot_init_bt_slave("YASA");
	}

	while(1)
	{
		display_goto_xy(0,1);
		display_string("Verbunden");
		display_update();
		WaitEvent(BT_SEND_MY_MESSAGE);
		ClearEvent(BT_SEND_MY_MESSAGE);
		ecrobot_send_bt_packet(BT_transmit_package, BT_PACKAGE_SIZE);
	}
	TerminateTask();
}
//pullt ständig aufm BT
//hat relativ niedirge prio
TASK(BT_IMPLIZIT_SLAVE2)
{
	
	U8 lastValue[BT_PACKAGE_SIZE];
	while(1)
	{
		WaitEvent(BT_IMPLIZIT_SLAVE2_EVENT);
		ClearEvent(BT_IMPLIZIT_SLAVE2_EVENT);
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

TASK(Trigger)
{
	while(1)
	{
		Trigger_Runnable();
	}
	TerminateTask();
}
