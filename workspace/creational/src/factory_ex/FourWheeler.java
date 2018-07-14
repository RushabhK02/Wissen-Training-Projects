package factory_ex;

class FourWheeler implements Vehicle {
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("FourWheeler: drive ");
	}

	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println("FourWheeler: refuel ");
	}

	@Override
	public void repair() {
		// TODO Auto-generated method stub
		System.out.println("FourWheeler: repair ");
	}

	@Override
	public void service() {
		// TODO Auto-generated method stub
		System.out.println("FourWheeler: service ");
	}
}
