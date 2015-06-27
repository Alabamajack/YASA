DeclareEvent(RTE_Trigger_GetValue_Receiver_In_EVENT);

inline std_return RTE_Schussanlage_SendMessage_Sender_Out(char *a)
{
	RTE_Output_GetValue_Receiver_In_SPEICHER = *a;
	SetEvent(Output_Task, RTE_Output_GetValue_Receiver_In_EVENT);
	RTE_Trigger_GetValue_Receiver_In_SPEICHER = *a;
	SetEvent(Trigger, RTE_Trigger_GetValue_Receiver_In_EVENT);
}	SetEvent(Output_Task, RTE_Output_GetValue_Receiver_In_EVENT);
}
	SetEvent(Trigger, RTE_Trigger_GetValue_Receiver_In_EVENT);
}
