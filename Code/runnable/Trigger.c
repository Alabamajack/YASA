char TriggerEvent = 0;
char blockEvent = 0;
#ifdef __DEBUG__
DISPLAY_OUTPUT(0,4, "Trigger wartet...");
#endif
RTE_Trigger_StartTrigger_GetValue_Event_In(&TriggerEvent);
RTE_Trigger_Schussanlage_SetEvent_Out();
RTE_Trigger_GetValue_Receiver_In(&blockEvent);