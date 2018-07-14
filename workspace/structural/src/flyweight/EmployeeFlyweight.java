package flyweight;

abstract class EmployeeFlyweight {
	private final String company = "Wissen technology";
	private final String address = "Bangalore";
	String designation;
	int salary;
	
	public String getCompany() {
		return company;
	}

	public String getAddress() {
		return address;
	}

	abstract void displayBio();
}
