char a = 0;
RTE_SchussMotor_GetValue_Event_In(&a);
uint32_t degree = 1 *360;
RTE_SchussMotor_SetOutputValue_OSPort_Out(&degree);