package hr.oop.main.collections.example4;

import hr.oop.main.collections.Student;

public class Student4 extends Student{

	public Student4(String lastName, String firstName, String studentID) {
		super(lastName, firstName, studentID);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student4)) return false;
		Student4 other = (Student4) obj;
		return this.studentID.equals(other.studentID);
	}
	
	@Override
	public int hashCode() {
		return this.studentID.hashCode();
	}
}
