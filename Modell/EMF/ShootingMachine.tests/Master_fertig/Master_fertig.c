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
DeclareTask(SchussanlagenTask);

DeclareTask(Output);

DeclareTask(StopSensor);

DeclareAlarm(StopSensorAlarm);
DeclareCounter(C_StopSensorAlarm);


//Ab hier werden alle Events und variablen zur Kommunikation eingefuegt:
DeclareEvent(RTE_Schussanlage_Trigger_GetValue_Event_In_EVENT);
DeclareEvent(RTE_Schussanlage_StopSensor_GetValue_Event_In_EVENT);
DeclareEvent(RTE_Trigger_GetValue_Receiver_In_EVENT);
U8 RTE_Trigger_GetValue_Receiver_In_SPEICHER[MAX_MESSAGE_LENGHT];
DeclareEvent(RTE_Output_GetValue_Receiver_In_EVENT);
U8 RTE_Output_GetValue_Receiver_In_SPEICHER[MAX_MESSAGE_LENGHT];
DeclareEvent(RTE_SchussMotor_GetValue_Event_In_EVENT);

inline std_return RTE_StopSensor_Schussanlage_SetValue_Event_Out()
{
	SetEvent(SchussanlagenTask, RTE_Schussanlage_StopSensor_GetValue_Event_In_EVENT);
	return 0;
}

inline std_return RTE_Schussanlage_SchussMotor_SetValue_Event_Out()
{
	SetEvent(TASK_BT_INTERFACE_WRITER, RTE_SchussMotor_GetValue_Event_In_EVENT);
	return 0;
}

inline std_return RTE_Schussanlage_SendMessage_Sender_Out(char *a)
{
	strcpy(COMSERVICE_transmit_package[3] ,a);
	SetEvent(TASK_BT_INTERFACE_WRITER, RTE_Trigger_GetValue_Receiver_In_EVENT);
	strcpy(RTE_Output_GetValue_Receiver_In_SPEICHER,a);
	SetEvent(Output, RTE_Output_GetValue_Receiver_In_EVENT);
	return 0;
}

inline std_return RTE_Schussanlage_Trigger_GetValue_Event_In(uint8_t *a)
{
	EventMaskType event = 0;
	GetEvent(SchussanlagenTask,&event);
	if(event & RTE_Schussanlage_Trigger_GetValue_Event_In_EVENT)
	{
		ClearEvent(RTE_Schussanlage_Trigger_GetValue_Event_In_EVENT);
		a[0] = 1;
	}
	else
	{
		a[0] = 0;
	}
	return 0;
}

inline std_return RTE_Schussanlage_StopSensor_GetValue_Event_In(uint8_t *a)
{
	EventMaskType event = 0;
	GetEvent(SchussanlagenTask,&event);
	if(event & RTE_Schussanlage_StopSensor_GetValue_Event_In_EVENT)
	{
		ClearEvent(RTE_Schussanlage_StopSensor_GetValue_Event_In_EVENT);
		a[0] = 1;
	}
	else
	{
		a[0] = 0;
	}
	return 0;
}

inline std_return RTE_Output_GetValue_Receiver_In(char *a)
{
	WaitEvent(RTE_Output_GetValue_Receiver_In_EVENT);
	ClearEvent(RTE_Output_GetValue_Receiver_In_EVENT);
	strcpy(a,RTE_Output_GetValue_Receiver_In_SPEICHER);
	return 0;
}
DeclareEvent(BT_IMPLIZIT_MASTER2_EVENT);
//Schussanlage_Runnable
void Schussanlage_Runnable()
{
uint8_t StopEvent = 0;
uint8_t StartEvent = 0;
const char* msg = "Alles aus!";
const char* msg2 = "you are dead!";
char shots = 1;
uint32_t retval = 0;
DISPLAY_OUTPUT(0,2, "Schussanlage_Waiting");
DISPLAY_OUTPUT(0,3, "Schussanlage_Waiting");
RTE_Schussanlage_StopSensor_GetValue_Event_In(&StopEvent);
if(StopEvent)
{
	#ifdef __DEBUG__
	DISPLAY_OUTPUT(0,2, "Schussanlage Stop!");
	#endif
	RTE_Output_SetOutput_OSPort_Out(msg);
}
else
{
	RTE_Schussanlage_Trigger_GetValue_Event_In(&StartEvent);
	if(StartEvent)
	{
		RTE_Schussanlage_SchussMotor_SetValue_Event_Out();
		systick_wait_ms(500);
		RTE_Schussanlage_SendMessage_Sender_Out(msg2);
	}
}

}

//Output_Runnable
void Output_Runnable()
{
	DISPLAY_OUTPUT(0,3, "Output_Runnable");
	DISPLAY_OUTPUT(0,4, "Output_Runnable");
	static int z = 0;
char msg[MAX_MESSAGE_LENGHT] = {0};
/* blockierender Aufruf */

RTE_Output_GetValue_Receiver_In(msg);
RTE_Output_SetOutput_OSPort_Out(msg);

}

//StopSensor_Runnable
void StopSensor_Runnable()
{
	
DISPLAY_OUTPUT(0,3, "StopSensor_Runnable");

DISPLAY_OUTPUT(0,5, "StopSensor_Runnable");
uint8_t triggerd = 0;
RTE_StopSensor_GetSensorValue_OSPort_In(&triggerd);
if(triggerd)
{
	#ifdef __DEBUG__
	DISPLAY_OUTPUT(0,3, "StopSensor ausgelost!");
	#endif
   RTE_StopSensor_Schussanlage_SetValue_Event_Out();
}
else
{
    /* kein AbbruchTaster gedr�ckt -> alles weiter */
}
TerminateTask();

}

void user_1ms_isr_type2(void){
	static int a = 0;
	SignalCounter(C_StopSensorAlarm);
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
		WaitEvent(RTE_Trigger_GetValue_Receiver_In_EVENT | RTE_SchussMotor_GetValue_Event_In_EVENT );
		GetEvent(TASK_BT_INTERFACE_WRITER, &event);
		if(event & RTE_Trigger_GetValue_Receiver_In_EVENT){
			ClearEvent(RTE_Trigger_GetValue_Receiver_In_EVENT);
			BT_transmit_package[0] =3;for(int i = 0; i < MAX_MESSAGE_LENGHT; i++)
				BT_transmit_package[i+1] = COMSERVICE_transmit_package[3][i];
			SetEvent(BT_IMPLIZIT_MASTER,BT_SEND_MY_MESSAGE);
		}if(event & RTE_SchussMotor_GetValue_Event_In_EVENT){
			ClearEvent(RTE_SchussMotor_GetValue_Event_In_EVENT);
			BT_transmit_package[0] =5;
			for(int i = 0; i < MAX_MESSAGE_LENGHT; i++) 
				BT_transmit_package[i+1] = COMSERVICE_transmit_package[5][i];
			SetEvent(BT_IMPLIZIT_MASTER,BT_SEND_MY_MESSAGE);
		}

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
	static int a = 0;
	while(1)
	{
		WaitEvent(BT_SEND_MY_MESSAGE);
		ClearEvent(BT_SEND_MY_MESSAGE);
		if(a == 0)
		{
			DISPLAY_OUTPUT(0,5,"hier");
			a = 1;
		}
		else
		{
		DISPLAY_OUTPUT(0,6,"hier");
		}
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
TASK(StopSensor)
{
	while(1)
	{
		StopSensor_Runnable();
	}
	TerminateTask();
}
