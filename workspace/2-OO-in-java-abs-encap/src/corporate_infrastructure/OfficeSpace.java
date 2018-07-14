package corporate_infrastructure;

public class OfficeSpace {
	
	public void displayInfo() {
		MultiFloorInfra infra = new MultiFloorInfra();
		
		//System.out.println("Status: "+status);
		System.out.println("Number of Cabins: "+infra.noOfCabins);
		System.out.println("Number of Floors: "+infra.noOfFloors);
		System.out.println("Headline: "+infra.infraSummary);
	}
}
