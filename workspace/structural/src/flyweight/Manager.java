package flyweight;

public class Manager extends EmployeeFlyweight {
	
	public Manager() {
		this.designation = "Manager";
		this.salary=60_000;
	}
	
	@Override
	void displayBio() {
		// TODO Auto-generated method stub
		System.out.println("Designation: "+designation);
		System.out.println("Salary: "+salary);
		System.out.println("Company: "+this.getCompany());
		System.out.println("Address: "+this.getAddress());
	}
}
