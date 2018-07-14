package ListenerOrObserver_Ex;

public class AC implements DoorObserver {

	@Override
	public void execute(int roomNo,int floorNo) {
		// TODO Auto-generated method stub
		System.out.println("AC state changed");
	}

	
}
