uint32_t shots = 1;
uint32_t shotsInDegree = shots * 360;
uint8_t triggered = 0;
(RTE_StartTrigger_GetSensorValue_OSPort_In(&triggered);
if(triggered)
{
    RTE_SchussMotor_SetOutputValue_OSPort_Out(shotsInDegree);
}
else
{
    /* do nothing */
}