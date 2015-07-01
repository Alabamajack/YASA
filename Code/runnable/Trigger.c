uint8_t TriggerEvent = 0;
uint8_t blockEvent = 0;

RTE_Trigger_StartTrigger_GetValue_Event_In(&TriggerEvent);
if(TriggerEvent)
{
	RTE_Trigger_Schussanlage_SetEvent_Out();
	RTE_Schussanlage_Trigger_GetValue_Event_In(&blockEvent);
}
else
{
	
}