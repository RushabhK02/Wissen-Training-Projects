package factory_ex;

public class Factory_Ex {

	public static void main(String[] args) {
		Vehicle vehicle;
		vehicle = VehicleFactory.getVehicle("TwoWheeler");
		vehicle.drive();
		vehicle.refuel();
		vehicle.repair();
	}
}
