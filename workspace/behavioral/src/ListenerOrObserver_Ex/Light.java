package ListenerOrObserver_Ex;

public class Light implements DoorObserver {

	@Override
	public void execute(int roomNo,int floorNo) {
		// TODO Auto-generated method stub
		System.out.println("Light state changed");
	}

}
