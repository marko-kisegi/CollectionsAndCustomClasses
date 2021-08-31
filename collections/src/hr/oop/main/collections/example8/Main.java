package hr.oop.main.collections.example8;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import hr.oop.main.collections.Common;

public class Main {

	public static void main(String[] args) {
	Comparator<Student8> comparator = Student8.BY_FIRST_NAME.reversed().thenComparing(Student8.BY_LAST_NAME).reversed();
	Set<Student8> students = new TreeSet<>(comparator);
	Common.fillStudentsCollection(students, Student8::new);
	System.out.println("Currently enrolled:");
	Common.printCollection(students);
	}
}
