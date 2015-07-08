	uint8_t value = 0;
	RTE_StopSensor_GetSensorValue_OSPort_In(&value);
	if(value >0)
	{
		DISPLAY_OUTPUT(0,6, "StopSensor");
		RTE_StopSensor_Manager_SetValue_Event_Out();
	}
	TerminateTask();