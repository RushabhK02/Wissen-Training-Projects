package Decorator;

public class LuxuryDecorator extends CarDecorator{
	
	public LuxuryDecorator(Car car) {
		super(car);	
	}
	
	public void getDescription() {
		this.car.displayCar();
		System.out.println("Sports");
	}
	
	
}
