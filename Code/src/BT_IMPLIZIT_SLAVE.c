#include "kernel.h"
#include "kernel_id.h"
#include "ecrobot_interface.h"
#include "YASA_global_variables.h"
#include "YASA_types.h"
/** @file BT_IMPLIZIT_MASTER.c
 *
 * Enthält Code um einen BT-Slave Task zu erstellen. Dieser kann sowohl Nachrichten empfangen als auch Nachrichten senden
 * zusammenfassend benötigt folgende externe Abhängigkeiten:
 * Variablen: BT_receive_package, BT_transmit_package
 * Makros: BT_PACKAGE_SIZE
 * Events: BT_HAS_RECEIVED_PACKAGE - setztend für Task TASK_BT_INTERFACE
 * 		   frägt Event ab, das auf eigenen Task gesetzt wird
 * Tasks: TASK_BT_INTERFACE
 *
 * @version 1.0
 * @date 2015-06-19
 * @authors Florian Laufenböck, Phillip Eidenschink, Tobias Schwindl, Tim Schmidl
 *
 */

extern BT_receive_package;
extern BT_transmit_package;

DeclareTask(BT_IMPLIZIT_SLAVE);

TASK(BT_IMPLIZIT_SLAVE)
{
	U8 lastValue[BT_PACKAGE_SIZE];
	EventMaskType bt_event;
	while(ecrobot_get_bt_status()!=BT_STREAM)
	{
		#ifdef __DEBUG__
		display_goto_xy(0,0);
		display_int(ecrobot_get_bt_status(), 0);
		display_update();
		#endif
		ecrobot_init_bt_slave("YASA");
	}

	while(1)
	{
		if(ecrobot_read_bt_packet(&lastValue, BT_PACKAGE_SIZE) > 0)
		{
			BT_receive_package = lastValue;
			SetEvent(TASK_BT_INTERFACE, BT_HAS_RECEIVED_PACKAGE);
		}
		if(GetEvent(BT_IMPLIZIT_SLAVE, &bt_event)
		{
			ClearEvent(bt_event);
			ecrobot_send_bt_packet(&BT_transmit_package, BT_PACKAGE_SIZE);
		}
	}
	TerminateTask();
}
