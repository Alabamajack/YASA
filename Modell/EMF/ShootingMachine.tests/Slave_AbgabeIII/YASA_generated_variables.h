#define RTE_StartTrigger_GetSensorValue_OSPort_In_PORT NXT_PORT_S1
#define RTE_StartTrigger_GetSensorValue_OSPort_In_BUTTON
#define RTE_Output_SetOutput_OSPort_Out_PORT Display
#define RTE_Output_SetOutput_OSPort_Out_DISPLAY
#define BT_COM_SERVICE 2

#define BT_DYNAMIC_READER_CODE switch(id){case 2:for(int i = 0; i < MAX_MESSAGE_LENGHT; i++)COMSERVICE_receive_package[2][i] = localBuffer[i+1];SetEvent(Display_Task,RTE_DisplayOutput_Manager_GetValue_Event_In_EVENT);break;}
#define BT_DYNAMIC_WRITER_CODE WaitEvent(RTE_Manager_Input_GetValue_Event_In_EVENT );GetEvent(TASK_BT_INTERFACE_WRITER, &event);if(event & RTE_Manager_Input_GetValue_Event_In_EVENT){ClearEvent(RTE_Manager_Input_GetValue_Event_In_EVENT);BT_transmit_package[0] =0;for(int i = 0; i < MAX_MESSAGE_LENGHT; i++) BT_transmit_package[i+1] = COMSERVICE_transmit_package[0][i];SetEvent(BT_IMPLIZIT_SLAVE,BT_SEND_MY_MESSAGE);}
