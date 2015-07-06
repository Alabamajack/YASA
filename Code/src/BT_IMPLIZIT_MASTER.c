void ecrobot_device_initialize()
{
	const U8 slaveAddr[7] = {BT_SLAVE_ADDRESS};
	ecrobot_init_bt_master(slaveAddr,"YASA");
}

//kriegt Events von der Comschicht
//bekommt die höchste Priorität im gesamten Prozess
//in extra Tasks aufgeteilt um Starvation zu vermeiden
TASK(BT_IMPLIZIT_MASTER)
{
	while(1)
	{
		WaitEvent(BT_SEND_MY_MESSAGE);
		ClearEvent(BT_SEND_MY_MESSAGE);
		ecrobot_send_bt_packet(BT_transmit_package, BT_PACKAGE_SIZE);
	}
	TerminateTask();
}

//pullt ständig aufm bluetooth
// sehr niedrige Priorität, kommt also nur dran, wenn grad nix anderes zu tun ist
TASK(BT_IMPLIZIT_MASTER2)
{
	U8 lastValue[BT_PACKAGE_SIZE];
	while(1)
	{
		WaitEvent(BT_IMPLIZIT_MASTER2_EVENT);
		ClearEvent(BT_IMPLIZIT_MASTER2_EVENT);
		if(ecrobot_read_bt_packet(lastValue, BT_PACKAGE_SIZE) > 0)
		{
			for(int i = 0; i < BT_PACKAGE_SIZE; i++) {
				BT_receive_package[i] = lastValue[i];
			}
			SetEvent(TASK_BT_INTERFACE_READER, BT_HAS_RECEIVED_PACKAGE);
		}
	}
	
	TerminateTask();
}