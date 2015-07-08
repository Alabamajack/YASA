	char a = 1;
	RTE_Manager_Input_GetValue_Event_In(&a);
			uint8_t value = 0;
	RTE_Manager_StopSensor_GetValue_Event_In(&value);
	if(value > 0)
	{
		DISPLAY_OUTPUT(0,5, "Stop__Sensor");
		while(1);
	}
	DISPLAY_OUTPUT(0,1, "Event empfangen");
	RTE_Manager_Output_SetValue_Sender_Out(&a);
	DISPLAY_OUTPUT(0,2, "Sender gesetzt");
	RTE_Manager_DisplayOutput_SetValue_Event_Out();