package Decorator;

public class Decorator_Ex {
	public static void main(String[] args) {
		Car car = new BasicCar();
		car.displayCar();
		
		CarDecorator carDecorator = new LuxuryDecorator(car);
		carDecorator.getDescription();
	
		carDecorator = new SportsDecorator(car);
		car.displayCar();
	}
}
