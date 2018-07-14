package ListenerOrObserver_Ex;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Door door = new Door(4,402);
		AC ac = new AC();
		Projector projector= new Projector();
		Light light = new Light();
		door.add(light);
		door.open();
		//doWork
		door.close();
		door.remove(light);
		door.open();
		//doWork
		door.close();
	}

}
