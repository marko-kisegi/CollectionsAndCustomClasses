package hr.oop.main.collections.example1;

import java.util.ArrayList;
import java.util.List;

import hr.oop.main.collections.Common;
import hr.oop.main.collections.Student;
import hr.oop.main.collections.StudentFactory;

public class ArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<>();
		StudentFactory<Student> factory = (last, first, id) -> new Student(last, first, id);
		
		Common.fillStudentsCollection(students, factory);
		System.out.println("Following students:");
		Common.printCollection(students);
		
		Student s = new Student("George", "Georgeson"	, "4567890123");
		System.out.println(s + " is present : " + students.contains(s));
		
		Student s2 = new Student("Poe", "Edgar Allan", "2345678901");		
		System.out.println("Poe present: " + students.contains(s2));
	}

}
