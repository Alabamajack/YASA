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
	EventMaskType event;
    while(1)
    {
		BT_DYNAMIC_Reader_CODE;
    }
    Terminate_Task();
}

//bekommt Nachrichten von Ports und verschickt diese über BT
TASK(TASK_BT_INTERFACE_WRITER)
{
    U8 localBuffer[BT_PACKAGE_SIZE];
    U8 id;
	EventMaskType event;
    while(1)
    {

		BT_DYNAMIC_WRITER_CODE;
    }

    TerminateTask();
}
