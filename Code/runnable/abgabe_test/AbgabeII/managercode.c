	char a = 5;
	RTE_Manager_Input_GetValue_Event_In(&a);
	DISPLAY_OUTPUT(0,1, "Event empfangen");
	RTE_Manager_Output_SetValue_Sender_Out(&a);
	DISPLAY_OUTPUT(0,2, "Sender gesetzt");
	RTE_Manager_DisplayOutput_SetValue_Event_Out();