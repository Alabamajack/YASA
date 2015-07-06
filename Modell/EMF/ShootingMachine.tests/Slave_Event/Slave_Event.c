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
U8 RTE_Trigger_GetValue_Receiver_In_SPEICHER;

inline std_return RTE_Schussanlage_SetValue_Sender_Out(char *a)
{
	strcpy(COMSERVICE_transmit_package[0] ,a);
	SetEvent(TASK_BT_INTERFACE_WRITER, RTE_Trigger_GetValue_Receiver_In_EVENT);
	return 0;
}
DeclareEvent(BT_IMPLIZIT_SLAVE2_EVENT);
//Trigger_Runnable
void Trigger_Runnable()
{
systick_wait_ms(5000);
	///
			display_goto_xy(0,3);
			display_string("user_task versendet");
			display_update();
	///
	char a[MAX_MESSAGE_LENGHT];
	strcpy(a, "A");
	
			// display_goto_xy(0,4);
		// display_hex(a[0], 2);
		// display_goto_xy(2,4);
		// display_hex(a[1], 2);
		// display_goto_xy(5,4);
		// display_hex(a[2], 2);
	
	RTE_Schussanlage_SetValue_Sender_Out(a);
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
