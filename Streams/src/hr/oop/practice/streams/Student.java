package hr.oop.practice.streams;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class Student implements Comparable<Student> {
	private String lastName;
	private String firstName;
	private String studentID;
	private int points;
	
	
	public Student(String lastName, String firstName, String studentID, int points) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = this.studentID;
		this.points = points;
	}
	@Override 
	public String toString(){
		return String.format("(%s) %s %s", studentID, firstName, lastName);
	}
	
	@Override
	public int hashCode() {
		return this.studentID.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student)) return false;
		Student other = (Student) obj;
		return this.studentID.equals(other.studentID);
	}

	@Override
	public int compareTo(Student o) {
		return this.studentID.compareTo(o.studentID);
	}
	
	private static Comparator<Object> comparator = Collator.getInstance(Locale.forLanguageTag("hr"));
	private static final Comparator<Student> BY_LAST_NAME = (o1, o2) -> comparator.compare(o1.lastName, o1.lastName);
	private static final Comparator<Student> BY_FIRST_NAME = (o1, o2) -> comparator.compare(o1.lastName, o2.lastName);	
	private static final Comparator<Student> BY_POINTS = (o1, o2) -> Integer.compare(o1.points, o2.points);
	private static final Comparator<Student> BY_STUDENT_ID = (o1, o2) -> o1.studentID.compareTo(o2.studentID);
	
	
}
