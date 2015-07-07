char shotevent = 0;
RTE_SchussMotor_GetValue_Receiver_In(&shotevent);
uint32_t degree= (uint32_t)shotevent;
degree = degree *360;
if(shotevent)
{
    RTE_SchussMotor_SetOutputValue_OSPort_Out(&schuesse);
}
else
{
    /* do nothing */
}