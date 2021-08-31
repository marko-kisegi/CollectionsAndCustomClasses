package hr.oop.main.collections.example4;

import java.util.Set;
import java.util.TreeSet;

import hr.oop.main.collections.Common;

public class TreeSetMain {
	public static void main(String[] args) {
		Set<Student4> students = new TreeSet<>(); 
		/*
		Common.fillStudentsCollection(students, Student4::new);		// doesnt work due treeset not being comparable	
		System.out.println("I have following students:");
		Common.printCollection(students);
		
		Student4 s = new Student4("Poe", "Edgar Allan", "2345678901");
		System.out.println("Poe present: " + students.contains(s));		
		*/
	}
}
