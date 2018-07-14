package Decorator;

abstract class CarDecorator implements Car {
	protected Car car;
	
	public CarDecorator(Car car){
		this.car=car;
	}
	
	@Override
	public void displayCar() {
		this.car.displayCar();
	}
	abstract void getDescription();
}
