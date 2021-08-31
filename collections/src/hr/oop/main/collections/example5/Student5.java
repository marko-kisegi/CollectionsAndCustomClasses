package hr.oop.main.collections.example5;

import hr.oop.main.collections.Student;

public class Student5 extends Student{

	public Student5(String lastName, String firstName, String studentID) {
		super(lastName, firstName, studentID);
		// TODO Auto-generated constructor stub
	}

	public int compareTo(Student5 other) {
		return this.studentID.compareTo(other.studentID);
	}

}
