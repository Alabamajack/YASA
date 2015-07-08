#define RTE_SchussMotor_SetOutputValue_OSPort_Out_PORT NXT_PORT_A
#define RTE_SchussMotor_SetOutputValue_OSPort_Out_ENGINE
#define BT_COM_SERVICE 1

#define BT_DYNAMIC_READER_CODE switch(id){case 0:for(int i = 0; i < MAX_MESSAGE_LENGHT; i++)COMSERVICE_receive_package[0][i] = localBuffer[i+1];SetEvent(Manager,RTE_Manager_Input_GetValue_Event_In_EVENT);break;}
#define BT_DYNAMIC_WRITER_CODE break;
