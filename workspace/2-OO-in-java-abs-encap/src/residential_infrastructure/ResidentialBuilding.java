package residential_infrastructure;

import corporate_infrastructure.MultiFloorInfra;

public class ResidentialBuilding extends MultiFloorInfra {
	
	public void displayInfo() {
		//System.out.println("Status: "+status);
		//System.out.println("Number of Cabins: "+noOfCabins);
		System.out.println("Number of Floors: "+noOfFloors);
		System.out.println("Headline: "+infraSummary);
	}

}
