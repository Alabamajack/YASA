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

inline std_return RTE_Trigger_GetValue_Receiver_In(char *a)
{
	WaitEvent(RTE_Trigger_GetValue_Receiver_In_EVENT);
	ClearEvent(RTE_Trigger_GetValue_Receiver_In_EVENT);
	strcpy(a, COMSERVICE_receive_package[0]);
	display_goto_xy(0,4);
	display_hex(COMSERVICE_receive_package[0][0], 4);
	display_update();
	return 0;
}
DeclareEvent(BT_IMPLIZIT_SLAVE2_EVENT);
//Trigger_Runnable
void Trigger_Runnable()
{
	static int i = 0;
	char a[MAX_MESSAGE_LENGHT] = {0};
	RTE_Trigger_GetValue_Receiver_In(a);
		//display_clear(0);
		display_goto_xy(0,6);
		display_hex(a[0],2);
		display_goto_xy(0,7);
		display_hex(i,4);
		display_update();
	if(a[0] != "0")
	{
		display_goto_xy(0,0);
		display_hex(a[0],2);
		display_goto_xy(0,6);
		//display_string("here bin ich drin");
		display_update();
	}
	else
	{
	}
	i++;
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
    char localBuffer[BT_PACKAGE_SIZE];
	int i = 0;
    U8 id;
	EventMaskType event;
	
    while(1)
    {
		WaitEvent(BT_HAS_RECEIVED_PACKAGE); // auf Event von BT-Handler warten
		ClearEvent(BT_HAS_RECEIVED_PACKAGE);
		for(i = 0; i < BT_PACKAGE_SIZE; i++)
			localBuffer[i] = BT_receive_package[i];
		id = localBuffer[0];
	
		switch(id){
			case 0:
			for( i = 1; i < MAX_MESSAGE_LENGHT; i++)
				COMSERVICE_receive_package[0][i-1] = localBuffer[i];
						
			SetEvent(Trigger,RTE_Trigger_GetValue_Receiver_In_EVENT);break;
		}
    }
    TerminateTask();
}
//bekommt Nachrichten von Ports und verschickt diese über BT
TASK(TASK_BT_INTERFACE_WRITER)
{
    char localBuffer[BT_PACKAGE_SIZE];
    U8 id;
	EventMaskType event;
	char* transmit_pack_ptr = BT_transmit_package;
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
	static uint8_t a = 0;
	char lastValue[BT_PACKAGE_SIZE];
	int i = 0;
	while(1)
	{
		WaitEvent(BT_IMPLIZIT_SLAVE2_EVENT);
		ClearEvent(BT_IMPLIZIT_SLAVE2_EVENT);
		
		///
					///
			// display_goto_xy(0,5);
			// display_string("BT kommt dran");
			// display_update();
			// a++;
			///
		
		///
		if(ecrobot_read_bt_packet(lastValue, BT_PACKAGE_SIZE) > 0)
		{
			for(i = 0; i < BT_PACKAGE_SIZE; i++)
			{
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
