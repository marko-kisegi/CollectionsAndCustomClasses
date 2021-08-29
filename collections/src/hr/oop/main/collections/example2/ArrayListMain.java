package hr.oop.main.collections.example2;

import java.util.ArrayList;
import java.util.List;

import hr.oop.main.collections.Common;

public class ArrayListMain {
	public static void main(String[] args) {
		List<Student2> students = new ArrayList<>();
		Common.fillStudentsCollection(students, Student2::new);
		System.out.println("Students currently enrolled in class are:");
		Common.printCollection(students);
		Student2 s = new Student2("Poe", "Edgar Allan", "2345678901");
		System.out.println("poe present: " + students.contains(s));
	}
}
