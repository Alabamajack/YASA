#define BT_COM_SERVICE 1

#define BT_DYNAMIC_READER_CODE 
( switch(id){case 0:strcpy(COMSERVICE_receive_package[0], locBuffer_ptr);SetEvent(Schussanlagen_Task,RTE_Schussanlage_Trigger_GetValue_Event_In_EVENT);break;})
#define BT_DYNAMIC_WRITER_CODE
