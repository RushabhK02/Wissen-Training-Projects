package com;

import departments.IT;
import student.GeneralStudent;
import student.ReservedStudent;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IT d1=new IT();
		d1.displayClassDet(new ReservedStudent());
		d1.displayClassDet(new GeneralStudent());
	}

}
