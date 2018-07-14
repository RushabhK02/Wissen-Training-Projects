package com.em.hr;

import com.em.emp.Employee;

public class HR {

	public static void manageEmployees() {
		Employee.tnrName = "Nag";

		Employee e1 = new Employee();
		e1.empId=1;
		e1.empName="A";
		e1.empSalary=2000.00;
		
		Employee e2 = new Employee();
		e2.empId=2;
		e2.empName="B";
		e2.empSalary=2000.00;
		
		Employee.doTeach();
		e1.doListenAndWork();
		e2.doListenAndWork();
	}

}
