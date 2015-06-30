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
		GetEvent(BT_IMPLIZIT_MASTER, &bt_event);
		if(ecrobot_read_bt_packet(&lastValue, BT_PACKAGE_SIZE) > 0)
		{
			strcpy(BT_receive_package, lastValue);
			SetEvent(TASK_BT_INTERFACE_READER, BT_HAS_RECEIVED_PACKAGE);
		}
		if(bt_event & BT_SEND_MY_MESSAGE)
		{
			ClearEvent(BT_SEND_MY_MESSAGE);
			ecrobot_send_bt_packet(&BT_transmit_package, BT_PACKAGE_SIZE);
		}
	}
	TerminateTask();
}
