uint8_t triggerd = 0;
RTE_Schussanlage_StopSensor_GetValue_Event_In(&triggerd);
if(triggerd)
{
    /* Output.c runnable code hier rein */
    /* dann einfach nichts mehr machen */
    while(1);
}
else
{
    /* kein AbbruchTaster gedrückt -> alles weiter */
}