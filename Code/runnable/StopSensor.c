uint8_t triggerd = 0;
RTE_StopSensor_GetSensorValue_OSPort_In(&triggerd);
if(triggerd)
{
   RTE_StopSensor_Schussanlage_SetValue_Event_Out();
}
else
{
    /* kein AbbruchTaster gedrückt -> alles weiter */
}