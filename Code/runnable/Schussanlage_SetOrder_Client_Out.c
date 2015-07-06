std_return Schussanlage_SetOrder_Client_Out(uint8_t* val)
{
	RTE_SchussMotor_SetOutputValue_OSPort_Out((*val) * 360);
	return 0;
}
