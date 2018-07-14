//a. package declaration
package com.em.emp;

//b. import statements

public class Employee {
	// a. State-definitions

	// i.class state
	public static final String COMP_NAME = "wissen";
	public static String tnrName;
	// ii.instance state
	public int empId;
	public String empName;
	public double empSalary = 1000.00;

	// b. constructor(s)
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// c. behavior

	// i.class behavior
	public static void doTeach() {
		System.out.println("Employee :: doTeach()");
	}
	//ii. instance behavior
	public void doListenAndWork() {
		System.out.println("emp :: doListenAndWork()");
	}
	
	//d.inner types
	
}
