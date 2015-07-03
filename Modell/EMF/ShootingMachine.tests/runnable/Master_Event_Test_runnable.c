uint8_t temp = 0;
	RTE_Schussanlage_GetValueFromTrigger_Event_In(&temp);
	if (temp)
	{
		display_goto_xy(0,0);
		display_string("Event");
		display_update();
	}
	else
	{
		display_goto_xy(0,0);
		display_string("else");
		display_update();
	}