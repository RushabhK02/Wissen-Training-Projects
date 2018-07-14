package singleton_ex;

final class Singleton{
	private static Singleton singleton;
	private Singleton() {}
	synchronized static Singleton getInstance() {
		if(singleton==null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}

public class Singleton_Ex {
	public static void main(String[] args) {
		
	}
}
