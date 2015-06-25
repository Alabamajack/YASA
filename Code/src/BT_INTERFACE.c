#include "kernel.h"
#include "kernel_id.h"
#include "ecrobot_interface.h"
#include "YASA_global_variables.h"
#include "YASA_types.h"
#include "YASA_helpfunctions.h"
/** @file TASK_BT_INTERFACE.h
 *
 * symbolisiert den Communication Service!
 *
 */

extern BT_receive_package;
extern BT_transmit_package;

extern COMSERVICE_transmit_package;
extern COMSERVICE_receive_package;

//bekommt Nachrichten vom BT und verteilt diese an die Ports
TASK(TASK_BT_INTERFACE_READER)
{
    U8 localBuffer[BT_PACKAGE_SIZE];
    U8 id;
	U8* locBuffer_ptr = localBuffer;
	EventMaskType event;
    while(1)
    {
		WaitEvent(BT_HAS_RECEIVED_PACKAGE);
		ClearEvent(BT_HAS_RECEIVED_PACKAGE);
		strcpy(localBuffer, BT_receiver_package);
		id = localBuffer[0];
		locBuffer_ptr++;
		strcpy(COMSERVICE_receive_package[id], locBuffer_ptr);
		switch(id){
			case 0:SetEvent(Output_Task,RTE_Output_GetValue_Receiver_In_EVENT);break;
			case 1:SetEvent(null,RTE_Trigger_GetValue_Receiver_In_EVENT);break;
		}
    }
    Terminate_Task();
}

//bekommt Nachrichten von Ports und verschickt diese über BT
TASK(TASK_BT_INTERFACE_WRITER)
{
    U8 localBuffer[BT_PACKAGE_SIZE];
    U8 id;
	EventMaskType event;
	U8* transmit_pack_ptr = BT_transmit_package;
    while(1)
    {

		BT_DYNAMIC_WRITER_CODE;
    }

    TerminateTask();
}
