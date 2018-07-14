import billing.GeneralBillingSystem;
import cart_details.CartLine;
import product_data.Item;

public class App {

	public static void main(String[] args) {
		Item i1 = new Item("A",100);
		Item i2 = new Item("B",50);
		Item i3 = new Item("C",25);
		Item itemList[]=new Item[3];
		itemList[0]=i1;
		itemList[1]=i2;
		itemList[2]=i3;
		
		CartLine c1=new CartLine(itemList);
		GeneralBillingSystem b1=new GeneralBillingSystem();
		int totalBill=b1.generateBill(c1);
		System.out.println("Total Bill: "+totalBill);
	}

}
