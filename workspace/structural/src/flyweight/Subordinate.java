package flyweight;

public class Subordinate extends EmployeeFlyweight {
	
	public Subordinate() {
		this.designation = "Subordinate";
		this.salary=25_000;
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
