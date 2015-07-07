uint8_t StopEvent = 0;
uint8_t StartEvent = 0;
const char* msg = "Alles aus!";
const char* msg2 = "you are dead!";
uint8_t shots = 1;
uint32_t retval = 0;
#ifdef __DEBUG__
DISPLAY_OUTPUT(0,2, "Schussanlage_Waiting");
#endif
RTE_Schussanlage_StopSensor_GetValue_Event_In(&StopEvent);
if(StopEvent)
{
	#ifdef __DEBUG__
	DISPLAY_OUTPUT(0,2, "Schussanlage Stop!");
	#endif
	RTE_Output_SetOutput_OSPort_Out(msg);
}
else
{
	RTE_Schussanlage_Trigger_GetValue_Event_In(&StartEvent);
	RTE_Schussanlage_SetOrder_Client_Out(&shots, &retval);
	RTE_Schussanlage_SendMessage_Sender_Out(msg2);
}
