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
DeclareTask(Schussanlagen_Task);



//Ab hier werden alle Events und variablen zur Kommunikation eingefuegt:
DeclareEvent(RTE_Trigger_GetValue_Receiver_In_EVENT);
U8 RTE_Trigger_GetValue_Receiver_In_SPEICHER;

inline std_return RTE_Schussanlage_SetValue_Sender_Out(char *a)
{
	strcpy(COMSERVICE_transmit_package[0] ,a);
	SetEvent(TASK_BT_INTERFACE_WRITER, RTE_Trigger_GetValue_Receiver_In_EVENT);
	return 0;
}
DeclareEvent(BT_IMPLIZIT_MASTER2_EVENT);
//Schussanlage_Runnable
void Schussanlage_Runnable()
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
    char localBuffer[BT_PACKAGE_SIZE];
    U8 id;
	char* locBuffer_ptr = localBuffer;
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
	char* transmit_pack_ptr = BT_transmit_package;
    while(1)
    {
		WaitEvent(RTE_Trigger_GetValue_Receiver_In_EVENT );
		GetEvent(TASK_BT_INTERFACE_WRITER, &event);
		if(event & RTE_Trigger_GetValue_Receiver_In_EVENT){
			ClearEvent(RTE_Trigger_GetValue_Receiver_In_EVENT);
			*transmit_pack_ptr = 0;
			transmit_pack_ptr++;
			strcpy(transmit_pack_ptr, COMSERVICE_transmit_package[0]);
		display_goto_xy(0,4);
					display_hex(BT_transmit_package[0], 2);
		display_goto_xy(2,4);
		display_hex(BT_transmit_package[1], 2);
		display_goto_xy(5,4);
		display_hex(BT_transmit_package[2], 2);
		display_update();
		systick_wait_ms(2000);
			SetEvent(BT_IMPLIZIT_MASTER,BT_SEND_MY_MESSAGE);
		}
		
	transmit_pack_ptr = BT_transmit_package;
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
			///
			display_goto_xy(0,2);
			display_string("versendet");
			display_update();
			///
		display_goto_xy(0,5);
		display_hex(BT_transmit_package[0], 2);
		display_goto_xy(2,5);
		display_hex(BT_transmit_package[1], 2);
		display_goto_xy(5,5);
		display_hex(BT_transmit_package[2], 2);
		display_update();
		ecrobot_send_bt_packet(BT_transmit_package, BT_PACKAGE_SIZE);
	}
	TerminateTask();
}

//pullt ständig aufm bluetooth
// sehr niedrige Priorität, kommt also nur dran, wenn grad nix anderes zu tun ist
TASK(BT_IMPLIZIT_MASTER2)
{
	char lastValue[BT_PACKAGE_SIZE];
	while(1)
	{
		WaitEvent(BT_IMPLIZIT_MASTER2_EVENT);
		ClearEvent(BT_IMPLIZIT_MASTER2_EVENT);
		if(ecrobot_read_bt_packet(lastValue, BT_PACKAGE_SIZE) > 0)
		{
			strcpy(BT_receive_package, lastValue);
			SetEvent(TASK_BT_INTERFACE_READER, BT_HAS_RECEIVED_PACKAGE);
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
