package mealitem;

public class MealItem {
	String name;
	String description;
	int price;
	
	public MealItem(String name, String description, int price) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.description = description;
		this.price=price;
	}

	public String getDescription() {
		return this.description;
	}

	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return this.price;
	}

}
