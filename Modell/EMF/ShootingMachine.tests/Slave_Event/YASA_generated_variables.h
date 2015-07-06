#define BT_COM_SERVICE 1

#define BT_DYNAMIC_READER_CODE switch(id){default:break;}
#define BT_DYNAMIC_WRITER_CODE WaitEvent(RTE_Trigger_GetValue_Receiver_In_EVENT );GetEvent(TASK_BT_INTERFACE_WRITER, &event);if(event & RTE_Trigger_GetValue_Receiver_In_EVENT){ClearEvent(RTE_Trigger_GetValue_Receiver_In_EVENT);BT_transmit_package[0] =0;for(int i = 0; i < MAX_MESSAGE_LENGHT; i++) BT_transmit_package[i+1] = COMSERVICE_transmit_package[0][i];SetEvent(BT_IMPLIZIT_SLAVE,BT_SEND_MY_MESSAGE);}
