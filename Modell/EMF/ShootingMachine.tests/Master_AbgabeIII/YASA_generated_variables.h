#define RTE_SchussMotor_SetOutputValue_OSPort_Out_PORT NXT_PORT_A
#define RTE_SchussMotor_SetOutputValue_OSPort_Out_ENGINE
#define RTE_StopSensor_GetSensorValue_OSPort_In_PORT NXT_PORT_S2
#define RTE_StopSensor_GetSensorValue_OSPort_In_BUTTON
#define BT_COM_SERVICE 2

#define BT_DYNAMIC_READER_CODE switch(id){case 0:for(int i = 0; i < MAX_MESSAGE_LENGHT; i++)COMSERVICE_receive_package[0][i] = localBuffer[i+1];SetEvent(Manager,RTE_Manager_Input_GetValue_Event_In_EVENT);break;}
#define BT_DYNAMIC_WRITER_CODE WaitEvent(RTE_DisplayOutput_Manager_GetValue_Event_In_EVENT );GetEvent(TASK_BT_INTERFACE_WRITER, &event);if(event & RTE_DisplayOutput_Manager_GetValue_Event_In_EVENT){ClearEvent(RTE_DisplayOutput_Manager_GetValue_Event_In_EVENT);BT_transmit_package[0] =2;for(int i = 0; i < MAX_MESSAGE_LENGHT; i++) BT_transmit_package[i+1] = COMSERVICE_transmit_package[2][i];SetEvent(BT_IMPLIZIT_MASTER,BT_SEND_MY_MESSAGE);}
