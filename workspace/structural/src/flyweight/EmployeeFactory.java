package flyweight;

class EmployeeFactory{
	EmployeeFlyweight employeeType1;
	EmployeeFlyweight employeeType2;
	
	public EmployeeFactory() {
		employeeType1 = new Manager();
		employeeType2 = new Subordinate();
	}
	
	public void getBio(String name,int ID) {
		if(ID>1000) {
			System.out.println("Name: "+name);
			System.out.println("ID: "+name);
			employeeType1.displayBio();
		}
		else {
			System.out.println("Name: "+name);
			System.out.println("ID: "+name);
			employeeType2.displayBio();
		}
	}

}
