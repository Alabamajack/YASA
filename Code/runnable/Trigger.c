uint8_t TriggerEvent = 0;
uint8_t blockEvent = 0;
#ifdef __DEBUG__
DISPLAY_OUTPUT(0,4, "Trigger wartet...");
#endif
RTE_Trigger_StartTrigger_GetValue_Event_In(&TriggerEvent);
if(TriggerEvent)
{
	RTE_Trigger_Schussanlage_SetEvent_Out();
	RTE_Schussanlage_Trigger_GetValue_Event_In(&blockEvent);
}
else
{
	
}