	uint8_t a = 0;
	RTE_StartTrigger_GetSensorValue_OSPort_In(&a);
	if(a)
	{
		DISPLAY_OUTPUT(0,1,"Taster gedruckt");
		RTE_Input_Manager_SetValue_Event_Out();
	}
	TerminateTask();