package ListenerOrObserver_Ex;

public class Projector implements DoorObserver{

	@Override
	public void execute(int roomNo,int floorNo) {
		// TODO Auto-generated method stub
		System.out.println("Projector state changed");
	}

}
