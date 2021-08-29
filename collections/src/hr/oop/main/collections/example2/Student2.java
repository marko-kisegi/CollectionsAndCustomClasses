package hr.oop.main.collections.example2;

import hr.oop.main.collections.Student;

public class Student2 extends Student{

	public Student2(String lastName, String firstName, String studentID) {
		super(lastName, firstName, studentID);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student2)) return false;
		Student2 other = (Student2) obj;
		return this.studentID.equals(other.studentID);
	}
	
}
