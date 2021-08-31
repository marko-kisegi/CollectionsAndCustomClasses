package hr.oop.main.collections.example5;

import java.util.Set;
import java.util.TreeSet;

import hr.oop.main.collections.Common;
import hr.oop.main.collections.example4.Student4;

public class TreeSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student4> students = new TreeSet<>( new StudentComparator());
		Common.fillStudentsCollection(students, Student4::new);
		System.out.println("Currently listed:");
		Common.printCollection(students);
		
		Student4 s = new Student4("Poe", "Edgar Allan", "2345678901");
		System.out.println("Poe present: " + students.contains(s));
	}

}
