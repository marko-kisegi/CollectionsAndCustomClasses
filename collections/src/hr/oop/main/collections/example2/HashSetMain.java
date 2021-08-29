package hr.oop.main.collections.example2;

import java.util.HashSet;
import java.util.Set;

import hr.oop.main.collections.Common;

public class HashSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student2> list = new HashSet<>();
		Common.fillStudentsCollection(list, Student2::new);
		System.out.println("Following students are:");
		Common.printCollection(list);
		
		Student2 s = new Student2("Poe","Edgar Allan","2345678901");
		System.out.println("Poe present: "+ list.contains(s));
		System.out.println(s);
	}

}
