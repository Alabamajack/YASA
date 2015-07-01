uint8_t shots = 1;
uint32_t ret_val;
uint8_t shotevent = 0;
RTE_Schussanlage_GetValue_Event_in(&shotevent);
if(shotevent)
{
    RTE_Schussanlage_SetValue_Event_Out();
}
else
{
    /* do nothing */
}