package Decorator;

public class SportsDecorator extends CarDecorator{
		
		public SportsDecorator(Car car) {
			super(car);	
		}
		
		public void getDescription() {
			this.car.displayCar();
			System.out.println("Sports");
		}
		
		
}
