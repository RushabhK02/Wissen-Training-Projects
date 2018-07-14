package corporate_infrastructure;

public class MultiFloorInfra {

	private String status = "Unallocated Building";
	int noOfCabins = 5;
	protected int noOfFloors = 7;
	public String infraSummary = "available to buy/sell";
	
	public void displayInfo() {
		System.out.println("Status: "+status);
		System.out.println("Number of Cabins: "+noOfCabins);
		System.out.println("Number of Floors: "+noOfFloors);
		System.out.println("Headline: "+infraSummary);
	}
}
