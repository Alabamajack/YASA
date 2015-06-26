uint8_t triggerd = 0;
RTE_StopSensor_GetSensorValue_OSPort_In(&triggerd);
if(triggerd)
{
    /* AbbruchTaster ist gedrückt -> alles stop */
    
}
else
{
    /* kein AbbruchTaster gedrückt -> alles weiter */
}