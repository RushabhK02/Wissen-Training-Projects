package ListenerOrObserver_Ex;
import java.util.*;


class Door {
	private int floorNo, roomNo;
	private final ArrayList<DoorObserver> doorObserverList = new ArrayList<DoorObserver>();
	
	public Door(int floorNo, int roomNo) {
		this.floorNo = floorNo;
		this.roomNo = roomNo;
	}
	
	public void add(DoorObserver doorObserver) {
		doorObserverList.add(doorObserver);
	}
	
	public void remove(DoorObserver doorObserver) {
		doorObserverList.remove(doorObserver);
	}
	
	public void open() {
		notifyObservers();
		//doWork
	}
	
	public void close(){
		//doWork
		notifyObservers();
	}
	
	private void notifyObservers() {
		for(DoorObserver doorObserver:doorObserverList) {
			doorObserver.execute(roomNo,floorNo);
		}
		
	}
}
