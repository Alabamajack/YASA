#define OSPortStopSensor_PORT NXT_PORT_S1
#define OSPortStopSensor_In_BUTTON
#define DisplayPORT Display
#define Display_Out_DSIPLAY
#define BT_COM_SERVICE 2

#define BT_DYNAMIC_READER_CODE switch(id){case 0:for(int i = 0; i < MAX_MESSAGE_LENGHT; i++)COMSERVICE_receive_package[0][i] = localBuffer[i+1];SetEvent(SchussanlagenTask,RTE_Schussanlage_Trigger_GetValue_Event_In_EVENT);break;}
#define BT_DYNAMIC_WRITER_CODE WaitEvent(RTE_Trigger_GetValue_Receiver_In_EVENT );GetEvent(TASK_BT_INTERFACE_WRITER, &event);if(event & RTE_Trigger_GetValue_Receiver_In_EVENT){ClearEvent(RTE_Trigger_GetValue_Receiver_In_EVENT);BT_transmit_package[0] =3;for(int i = 0; i < MAX_MESSAGE_LENGHT; i++) BT_transmit_package[i+1] = COMSERVICE_transmit_package[3][i];SetEvent(BT_IMPLIZIT_MASTER,BT_SEND_MY_MESSAGE);}
