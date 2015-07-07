uint8_t triggerd = 0;
RTE_StopSensor_GetSensorValue_OSPort_In(&triggerd);
if(triggerd)
{
	#ifdef __DEBUG__
	DISPLAY_OUTPUT(0,3, "StopSensor ausgelost!");
	#endif
   RTE_StopSensor_Schussanlage_SetValue_Event_Out();
}
else
{
    /* kein AbbruchTaster gedrückt -> alles weiter */
}