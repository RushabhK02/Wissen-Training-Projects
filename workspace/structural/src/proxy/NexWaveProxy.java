package proxy;

class NexWaveProxy {
	private Logging logger;
	private Security guard;
	private NexWave nexWave;
	
	public NexWaveProxy(Logging logging, Security security,NexWave nexWave) {
		logger = logging;
		guard = security;
		this.nexWave=nexWave;
	}
	
	public void executeCommand(String command) {
		if(command=="getTraining") {
			guard.doSecurityCheck();
			logger.doLog();
			nexWave.getTraining();
			logger.doLog();
		}
	}
}
