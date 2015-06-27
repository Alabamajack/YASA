#define BT_COM_SERVICE 2

#define BT_DYNAMIC_READER_CODE ( switch(id){case 0:SetEvent(Output_Task,RTE_Output_GetValue_Receiver_In_EVENT);break;case 1:SetEvent(Trigger,RTE_Trigger_GetValue_Receiver_In_EVENT);break;})
#define BT_DYNAMIC_WRITER_CODE
