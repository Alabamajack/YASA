	char a = 0;
	RTE_Output_Manager_GetValue_Receiver_In(&a);
	DISPLAY_OUTPUT(0,3,"Output emfangen");
	uint32_t b = a * 360;
	RTE_SchussMotor_SetOutputValue_OSPort_Out(&b);