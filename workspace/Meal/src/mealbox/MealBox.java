package mealbox;

import mealitem.MealItem;

public class MealBox {
	MealItem mealItemList[];
	int totalPrice=0;
	
	public int getTotalPrice() {
		setTotalPrice();
		return totalPrice;
	}
	
	private void setTotalPrice() {
		for(MealItem mealitem:mealItemList) {
			totalPrice+=mealitem.getPrice();
		}
	}
	
	public MealBox(MealItem[] mealList) {
		this.mealItemList=mealList;
		this.totalPrice=this.getTotalPrice();
	}
}
