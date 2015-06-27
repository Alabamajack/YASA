char msg[128] = {0};
/* blockierender Aufruf */
RTE_Output_GetValue_Event_In();
/* blockierender Aufruf */
RTE_Output_GetValue_Receiver_In(&msg);
RTE_Output_SetOutput_OSPort_Out(msg);