package hr.oop.main.collections.example6;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import hr.oop.main.collections.Common;
import hr.oop.main.collections.example4.Student4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentComparator comparator = new StudentComparator();
		Comparator<Student4> reverse = Collections.reverseOrder(comparator);
		Set<Student4> students = new TreeSet<>(reverse);
		
		Common.fillStudentsCollection(students, Student4::new);
		System.out.println("Following students are enlisted:");
		Common.printCollection(students);
		
		ReverseComparator<Student4> reversecomparator = new ReverseComparator<Student4>(comparator);
		reversecomparator = new ReverseComparator<Student4>(reversecomparator);
		Set<Student4> students2 = new TreeSet<>(reversecomparator);
		Common.fillStudentsCollection(students2, Student4::new);
		System.out.println("Following students are enlisted:");
		Common.printCollection(students2);
	}

}
