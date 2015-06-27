uint8_t triggered = 0;
RTE_Trigger_GetMessage_Receiver_In();
RTE_Trigger_GetValue_Event_In();
if (triggered)
{
    /* Trigger fuers schießen ausgelöst -> here we go */
    RTE_StartTrigger_SetValue_Event_out();
}
else
{
    /* Trigger fuers schießen nicht ausgelöst -> nichts tun*/
}    