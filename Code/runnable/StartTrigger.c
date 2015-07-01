uint8_t triggered = 0;
if (triggered)
{
    /* Trigger fuers schießen ausgelöst -> here we go */
	RTE_StartTrigger_Trigger_SetValue_Event_Out();
}
else
{
    /* Trigger fuers schießen nicht ausgelöst -> nichts tun*/
}    