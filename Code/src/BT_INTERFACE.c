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

TASK(TASK_BT_INTERFACE_READER)
{
    U8 localBuffer[BT_PACKAGE_SIZE];
    U8 id;
    while(1)
    {
        WaitEvent(BT_HAS_RECEIVED_PACKAGE);
        ClearEvent(BT_HAS_RECEIVED_PACKAGE);
        strcpy(localBuffer, BT_receive_package);
        id = CHAR_TO_INT(localBuffer[0]);
        // ids werden konfiguriert, sind also dynamisch und werden nur benötigt, wenn man über mehrere bricks hinweg kommunizieren will.
        // also muss man hier verschiedene IDs generieren(die von der Konfiguration kommen)

    }
    Terminate_Task();
}

TASK(TASK_BT_INTERFACE_WRITER)
{
    U8 localBuffer[BT_PACKAGE_SIZE];
    U8 id;
    while(1)
    {
        WaitEvent(BT_SEND_MY_MESSAGE);
        ClearEvent(BT_SEND_MY_MESSAGE);
    }

    TerminateTask();
}
