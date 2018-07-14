package billing;

import cart_details.CartLine;
import product_data.Item;

public class GeneralBillingSystem extends BillingSystem {

	@Override
	public int generateBill(CartLine cartline) {
		Item[] cart = cartline.getCart();
		int bill=0;
		for(Item item:cart) {
			bill+=item.getPrice();
		}
		return bill;
	}

}