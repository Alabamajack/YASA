DeclareEvent(RTE_Output_GetValue_Receiver_In_EVENT);
U8 RTE_Output_GetValue_Receiver_In_SPEICHER[MAX_MESSAGE_LENGHT] = {0};
DeclareEvent(RTE_Trigger_GetValue_Receiver_In_EVENT);
U8 RTE_Trigger_GetValue_Receiver_In_SPEICHER[MAX_MESSAGE_LENGHT] = {0};

inline std_return RTE_Schussanlage_SendMessage_Sender_Out(char *a)
{
	RTE_Output_GetValue_Receiver_In_SPEICHER = *a;
	SetEvent(Output_Task, RTE_Output_GetValue_Receiver_In_EVENT);
	RTE_Trigger_GetValue_Receiver_In_SPEICHER = *a;
	SetEvent(null, RTE_Trigger_GetValue_Receiver_In_EVENT);
}