#define BT_COM_SERVICE 1

#define BT_DYNAMIC_READER_CODE ( switch(id){case 0:strcpy(RTE_Schussanlage_Trigger_GetValue_Event_In_SPEICHER, locBuffer_ptr);SetEvent(SchussanlagenTask,RTE_Schussanlage_Trigger_GetValue_Event_In_EVENT);break;})
#define BT_DYNAMIC_WRITER_CODE
