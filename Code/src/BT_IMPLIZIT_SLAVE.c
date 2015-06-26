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
