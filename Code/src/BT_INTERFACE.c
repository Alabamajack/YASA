//bekommt Nachrichten vom BT und verteilt diese an die Ports
TASK(TASK_BT_INTERFACE_READER)
{
    U8 localBuffer[BT_PACKAGE_SIZE];
    U8 id;
	EventMaskType event;
	
    while(1)
    {
		WaitEvent(BT_HAS_RECEIVED_PACKAGE); // auf Event von BT-Handler warten
		ClearEvent(BT_HAS_RECEIVED_PACKAGE);
		for(int i = 0; i < BT_PACKAGE_SIZE; i++)
			localBuffer[i] = BT_receive_package[i];
		id = localBuffer[0];
		
		BT_DYNAMIC_READER_CODE;
    }
    TerminateTask();
}
//bekommt Nachrichten von Ports und verschickt diese ueber BT
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