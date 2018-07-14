package proxy;

public class Proxy_Ex {

	public static void main(String[] args) {
		NexWave nexWave = new NexWave();
		Logging logger = new Logging();
		Security guard = new Security();
		NexWaveProxy nexWaveProxy= new NexWaveProxy(logger, guard, nexWave);
		nexWaveProxy.executeCommand("getTraining");
	}
}
