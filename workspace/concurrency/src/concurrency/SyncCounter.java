package concurrency;

class SyncCounter {
	static Object syncObj;
	int counter=1;
	static Object getSyncObj() {
		return syncObj;
	}

	static void setSyncObj(Object syncObj) {
		SyncCounter.syncObj = syncObj;
	}
	
}
