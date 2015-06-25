#include "kernel.h"
#include "kernel_id.h"
#include "ecrobot_interface.h"
#include "YASA_global_variables.h"
#include "YASA_types.h"
/** @file BT_IMPLIZIT_MASTER.c
 *
 * Enthält Code um einen BT-Master Task zu erstellen. Dieser kann sowohl Nachrichten empfangen als auch Nachrichten senden
 * zusammenfassend benötigt folgende externe Abhängigkeiten:
 * Variablen: BT_receive_package, BT_transmit_package
 * Makros: BT_SLAVE_ADDRESS, BT_PACKAGE_SIZE
 * Events: BT_HAS_RECEIVED_PACKAGE - setztend für Task TASK_BT_INTERFACE_READER
 * 		   frägt Event ab, das auf eigenen Task gesetzt wird
 * Tasks: TASK_BT_INTERFACE_READER
 *
 * @version 1.0
 * @date 2015-06-19
 * @authors Florian Laufenböck, Phillip Eidenschink, Tobias Schwindl, Tim Schmidl
 *
 */

extern BT_receive_package;
extern BT_transmit_package;

DeclareTask(BT_IMPLIZIT_MASTER);
DeclareEvent(BT_SEND_MY_MESSAGE);

void ecrobot_device_initialize()
{
	const U8 slaveAddr[7] = {BT_SLAVE_ADDRESS};
	ecrobot_init_bt_master(slaveAddr,"YASA");
}

TASK(BT_IMPLIZIT_MASTER)
{
	U8 lastValue[BT_PACKAGE_SIZE];
	EventMaskType bt_event;
	while(1)
	{
		if(ecrobot_read_bt_packet(&lastValue, BT_PACKAGE_SIZE) > 0)
		{
			BT_receive_package = lastValue;
			SetEvent(TASK_BT_INTERFACE_READER, BT_HAS_RECEIVED_PACKAGE);
		}
		if(GetEvent(BT_IMPLIZIT_MASTER, &bt_event)
		{
			ClearEvent(bt_event);
			ecrobot_send_bt_packet(&BT_transmit_package, BT_PACKAGE_SIZE);
		}
	}
	Terminate_Task();
}
