package billing;

import cart_details.CartLine;

abstract class BillingSystem {

	public abstract int generateBill(CartLine cartLine);
}
