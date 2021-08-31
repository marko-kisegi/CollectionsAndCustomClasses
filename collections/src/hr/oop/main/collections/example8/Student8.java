package hr.oop.main.collections.example8;

import java.util.Comparator;

import hr.oop.main.collections.example5.Student5;

public class Student8 extends Student5 {

	public Student8(String lastName, String firstName, String studentID) {
		super(lastName, firstName, studentID);
		// TODO Auto-generated constructor stub
	}

	public static final Comparator<Student8> BY_LAST_NAME = (o1, o2) -> o1.lastName.compareTo(o2.lastName);
	public static final Comparator<Student8> BY_FIRST_NAME = Comparator.comparing(Student8::getFirstName);
	public static final Comparator<Student8> BY_STUDENT_ID = Comparator.comparing(Student8::getStudentID);
}
