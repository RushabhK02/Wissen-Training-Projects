package factory_ex;

public class VehicleFactory {
	public static Vehicle getVehicle(String vehicleType) {
		if (vehicleType == "TwoWheeler")
			return new TwoWheeler();
		else if(vehicleType == "FourWheeler")
			return new FourWheeler();
		else if(vehicleType == "SixWheeler")
			return new SixWheeler();
		return null;
	}
}
