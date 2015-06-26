#define BT_COM_SERVICE 2

#define BT_DYNAMIC_READER_CODE ( switch(id){})
#define BT_DYNAMIC_WRITER_CODE (WaitEvent(RTE_Output_GetValue_Receiver_In_EVENT | RTE_Trigger_GetValue_Receiver_In_EVENT );GetEvent(TASK_BT_INTERFACE_WRITER, &event);if(event & RTE_Output_GetValue_Receiver_In_EVENT){ClearEvent(RTE_Output_GetValue_Receiver_In_EVENT);*transmit_pack_ptr = 0;transmit_pack_ptr++;strcpy(BT_transmit_package, COMSERVICE_transmit_package[0]);SetEvent(BT_IMPLIZIT_MASTER,BT_SEND_MY_MESSAGE);}if(event & RTE_Trigger_GetValue_Receiver_In_EVENT){ClearEvent(RTE_Trigger_GetValue_Receiver_In_EVENT);*transmit_pack_ptr = 1;transmit_pack_ptr++;strcpy(BT_transmit_package, COMSERVICE_transmit_package[1]);SetEvent(BT_IMPLIZIT_MASTER,BT_SEND_MY_MESSAGE);})
