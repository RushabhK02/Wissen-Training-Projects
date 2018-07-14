package tiffin_builder;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiffin_Builder tiffin_Builder = new Tiffin_Builder();
		ArrayList<String> meal=new ArrayList<String>();
		meal.add("Paneer sabji");
		meal.add("Dal");
		meal.add("2 Rotis");
		meal.add("Curd");
		meal.add("Rice");
		meal.add("Pickle");
		int mealCost=0;
		try{
		mealCost = tiffin_Builder.customizeMeal(meal);
		}catch(TiffinBoxException tiffinBoxException) {
			System.out.println(tiffinBoxException.getMessage());
		}
		System.out.println("Price of the meal: "+mealCost);
	}

}
