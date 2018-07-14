package mealbuilder;

import mealbox.MealBox;
import mealitem.*;

public class MealBuilder {
	
	public MealBox mealBox1,mealBox2;
	
	public MealBuilder() {
		MealItem vegetable1 = new MealItem("Potato","Mashed potato in spicy gravy",50);
		MealItem vegetable2 = new MealItem("Paneer","Seasoned tandoori paneer in spicy gravy",80);
		
		MealItem curry1 = new MealItem("Tadka Dal","Chana dal with herbs and spices", 35);
		MealItem curry2 = new MealItem("Dal fry", "Thick dal with herbs and spices", 55);
		
		MealItem rice = new MealItem("Basmati","Hot Basmati Rice",60);
		
		MealItem bread = new MealItem("4 Roti","4 freshly made rotis from tandoor",50);
		
		MealItem meal1[] = new MealItem[3];
		meal1[0]=vegetable1;
		meal1[1]=curry1;
		meal1[2]=bread;
		mealBox1 = new MealBox(meal1);
		
		MealItem meal2[] = new MealItem[3];
		meal2[0]=vegetable2;
		meal2[1]=curry2;
		meal2[2]=rice;
		mealBox2 = new MealBox(meal2);
		
	}
	
}
