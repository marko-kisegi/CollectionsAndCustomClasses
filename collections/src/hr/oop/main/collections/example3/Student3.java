package hr.oop.main.collections.example3;

import hr.oop.main.collections.Student;

public class Student3 extends Student {
	public Student3(String lastName, String firstName, String studentID) {
		super(lastName, firstName, studentID);
	}
	
	@Override
	public int hashCode() {
		return this.studentID.hashCode();
	}
}
