#define RTE_StartTrigger_GetSensorValue_OSPort_In_PORT NXT_PORT_S1
#define RTE_StartTrigger_GetSensorValue_OSPort_In_BUTTON
#define RTE_SchussMotor_SetOutputValue_OSPort_Out_PORT NXT_PORT_A
#define RTE_SchussMotor_SetOutputValue_OSPort_Out_ENGINE
#define BT_COM_SERVICE 3

#define BT_DYNAMIC_READER_CODE switch(id){case 3:for(int i = 0; i < MAX_MESSAGE_LENGHT; i++)COMSERVICE_receive_package[3][i] = localBuffer[i+1];SetEvent(Trigger,RTE_Trigger_GetValue_Receiver_In_EVENT);break;case 5:for(int i = 0; i < MAX_MESSAGE_LENGHT; i++)COMSERVICE_receive_package[5][i] = localBuffer[i+1];SetEvent(SchussMotor,RTE_SchussMotor_GetValue_Event_In_EVENT);break;}
#define BT_DYNAMIC_WRITER_CODE WaitEvent(RTE_Schussanlage_Trigger_GetValue_Event_In_EVENT );GetEvent(TASK_BT_INTERFACE_WRITER, &event);if(event & RTE_Schussanlage_Trigger_GetValue_Event_In_EVENT){ClearEvent(RTE_Schussanlage_Trigger_GetValue_Event_In_EVENT);BT_transmit_package[0] =0;for(int i = 0; i < MAX_MESSAGE_LENGHT; i++) BT_transmit_package[i+1] = COMSERVICE_transmit_package[0][i];SetEvent(BT_IMPLIZIT_SLAVE,BT_SEND_MY_MESSAGE);}
