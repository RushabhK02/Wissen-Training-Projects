package cart_details;

import product_data.Item;

public class CartLine {
	private Item cart[];
	public CartLine(Item list[]) {
		this.cart=list;
	}
	public Item[] getCart() {
		return this.cart;
	}
}
