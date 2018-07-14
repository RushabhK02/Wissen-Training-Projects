package lambda_expr;

public class Employee implements Comparable<Employee> {
	
	private String name;
	private double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public static final Employee[] SOME = {
			new Employee("Mike", 2500),
			new Employee("Frank", 3000),
			new Employee("Hannah", 2500),
			new Employee("Rajeev", 2000),
			new Employee("Jessica", 1500),
			new Employee("Doug", 2000),
			new Employee("Chen", 3500),
			new Employee("Krish", 2200),
			new Employee("Louie", 800),
			new Employee("Nag", 100)
		};


	

}
