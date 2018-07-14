package factory_ex;

class TwoWheeler implements Vehicle {
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("TwoWheeler: drive ");
	}

	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println("TwoWheeler: refuel ");
	}

	@Override
	public void repair() {
		// TODO Auto-generated method stub
		System.out.println("TwoWheeler: repair ");
	}

	@Override
	public void service() {	
		// TODO Auto-generated method stub
		System.out.println("TwoWheeler: service ");
	}
}
