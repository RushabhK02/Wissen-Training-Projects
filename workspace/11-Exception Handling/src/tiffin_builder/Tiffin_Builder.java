package tiffin_builder;

import java.util.ArrayList;

class Tiffin_Builder {
	public int customizeMeal(ArrayList<String> items) {
		int count=0;
		for(String s:items) {
			count++;
		}

		if(count>5) {
				throw new TiffinBoxException("Added Too many items");
			}
		return count*25;
			
	}
}
