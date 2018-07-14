package departments;

import student.Student;

public class IT {
	private Student student;
	public void displayClassDet(Student student) {
		setStudent(student);
		this.student.displayInfo();
	}
	public void setStudent(Student student) {
		this.student = student;
	}
}
