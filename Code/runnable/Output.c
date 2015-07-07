char msg[MAX_MESSAGE_LENGHT] = {0};
/* blockierender Aufruf */
#ifdef __DEBUG__
DISPLAY_OUTPUT(0,1, "Output waiting");
#endif 
RTE_Output_GetValue_Receiver_In(msg);
#ifdef __DEBUG__
DISPLAY_OUTPUT(0,1, "Output empfangen");
#endif
RTE_Output_SetOutput_OSPort_Out(msg);