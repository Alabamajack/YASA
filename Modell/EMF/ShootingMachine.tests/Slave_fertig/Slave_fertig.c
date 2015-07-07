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
DeclareTask(BT_IMPLIZIT_SLAVE);
DeclareTask(BT_IMPLIZIT_SLAVE2);
DeclareEvent(BT_HAS_RECEIVED_PACKAGE);
DeclareEvent(BT_SEND_MY_MESSAGE);
DeclareTask(Trigger);

DeclareTask(StartTrigger);

DeclareTask(SchussMotor);

DeclareAlarm(StartTriggerAlarm);
DeclareCounter(C_StartTriggerAlarm);


//Ab hier werden alle Events und variablen zur Kommunikation eingefuegt:
DeclareEvent(RTE_Schussanlage_Trigger_GetValue_Event_In_EVENT);
DeclareEvent(RTE_Trigger_StartTrigger_GetValue_Event_In_EVENT);
DeclareEvent(RTE_Trigger_GetValue_Receiver_In_EVENT);
DeclareEvent(RTE_SchussMotor_GetValue_Event_In_EVENT);

inline std_return RTE_Trigger_Schussanlage_SetEvent_Out()
{
	SetEvent(TASK_BT_INTERFACE_WRITER, RTE_Schussanlage_Trigger_GetValue_Event_In_EVENT);
	return 0;
}

inline std_return RTE_StartTrigger_Trigger_SetValue_Event_Out()
{
	SetEvent(Trigger, RTE_Trigger_StartTrigger_GetValue_Event_In_EVENT);
	return 0;
}

inline std_return RTE_Trigger_StartTrigger_GetValue_Event_In(char *a)
{
	WaitEvent(RTE_Trigger_StartTrigger_GetValue_Event_In_EVENT);
	ClearEvent(RTE_Trigger_StartTrigger_GetValue_Event_In_EVENT);
	return 0;
}

inline std_return RTE_Trigger_GetValue_Receiver_In(char *a)
{
	WaitEvent(RTE_Trigger_GetValue_Receiver_In_EVENT);
	ClearEvent(RTE_Trigger_GetValue_Receiver_In_EVENT);
	for(int i=0; i< MAX_MESSAGE_LENGHT; i++){
		a[i] = COMSERVICE_receive_package[3][i];
	}
	return 0;
}

inline std_return RTE_SchussMotor_GetValue_Event_In(char *a)
{
	WaitEvent(RTE_SchussMotor_GetValue_Event_In_EVENT);
	ClearEvent(RTE_SchussMotor_GetValue_Event_In_EVENT);
	return 0;
}
DeclareEvent(BT_IMPLIZIT_SLAVE2_EVENT);
//Trigger_Runnable
void Trigger_Runnable()
{
char TriggerEvent = 0;
char blockEvent = 0;
#ifdef __DEBUG__
DISPLAY_OUTPUT(0,4, "Trigger wartet...");
#endif
RTE_Trigger_StartTrigger_GetValue_Event_In(&TriggerEvent);
RTE_Trigger_Schussanlage_SetEvent_Out();
RTE_Trigger_GetValue_Receiver_In(&blockEvent);

}

//StartTrigger_Runnable
void StartTrigger_Runnable()
{
	static int u = 0;
uint8_t triggered = 0;
RTE_StartTrigger_GetSensorValue_OSPort_In(&triggered);
if (triggered)
{
    /* Trigger fuers schießen ausgelöst -> here we go */
	if(!u)
	{
		DISPLAY_OUTPUT(0,5, "StartTrigger go!");
		u = 1;
	}
	else
	{
		DISPLAY_OUTPUT(0,6, "starttrigger");
	}
	RTE_StartTrigger_Trigger_SetValue_Event_Out();
}
else
{
    /* Trigger fuers schießen nicht ausgelöst -> nichts tun*/
}    
TerminateTask();

}

//SchussMotor_Runnable
void SchussMotor_Runnable()
{
char a = 0;
RTE_SchussMotor_GetValue_Event_In(&a);
uint32_t degree = 1 *360;
RTE_SchussMotor_SetOutputValue_OSPort_Out(&degree);

}

void user_1ms_isr_type2(void){
	static int a = 0;
	SignalCounter(C_StartTriggerAlarm);
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
			case 3:
				for(int i = 0; i < MAX_MESSAGE_LENGHT; i++)
					COMSERVICE_receive_package[3][i] = localBuffer[i+1];
				DISPLAY_OUTPUT(0,2,"test");
				SetEvent(Trigger,RTE_Trigger_GetValue_Receiver_In_EVENT);break;
			case 5:
				for(int i = 0; i < MAX_MESSAGE_LENGHT; i++)
					COMSERVICE_receive_package[5][i] = localBuffer[i+1];
				DISPLAY_OUTPUT(0,3, "test");
				SetEvent(SchussMotor,RTE_SchussMotor_GetValue_Event_In_EVENT);break;
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
	static int j=0;
	U8 lastValue[BT_PACKAGE_SIZE];
	while(1)
	{
		WaitEvent(BT_IMPLIZIT_SLAVE2_EVENT);
		ClearEvent(BT_IMPLIZIT_SLAVE2_EVENT);
		if(ecrobot_read_bt_packet(lastValue, BT_PACKAGE_SIZE) > 0)
		{
			display_goto_xy(j,5);
			display_string("c");
			display_update();
			j++;
			if(j >= 10)
				j = 0;
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
TASK(StartTrigger)
{
	while(1)
	{
		StartTrigger_Runnable();
	}
	TerminateTask();
}
TASK(SchussMotor)
{
	while(1)
	{
		SchussMotor_Runnable();
	}
	TerminateTask();
}
