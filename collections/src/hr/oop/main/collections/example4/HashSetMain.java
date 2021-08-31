package hr.oop.main.collections.example4;

import java.util.HashSet;
import java.util.Set;

import hr.oop.main.collections.Common;

public class HashSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student4> students = new HashSet<>();
		Common.fillStudentsCollection(students, Student4::new);
		System.out.println("Current list:");
		Common.printCollection(students);
		
		Student4 s = new Student4("Poe", "Edgar Allan", "2345678901");
		System.out.println("Poe present : " + students.contains(s));
	}

}
