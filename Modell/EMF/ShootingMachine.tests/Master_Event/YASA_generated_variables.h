#define BT_COM_SERVICE 1

#define BT_DYNAMIC_READER_CODE switch(id){case 0:for(int i = 0; i < MAX_MESSAGE_LENGHT; i++)COMSERVICE_receive_package[0][i-1] = localBuffer[i];SetEvent(Schussanlagen_Task,RTE_Trigger_GetValue_Receiver_In_EVENT);break;}
#define BT_DYNAMIC_WRITER_CODE break;
