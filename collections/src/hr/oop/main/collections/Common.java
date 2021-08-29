package hr.oop.main.collections;

import java.util.Collection;

public class Common {
	public static <T> void printCollection(Collection<T> col) {
		for(T element : col) {
			System.out.println(element);
		}
		System.out.println();
	}
	
	public static <S extends Student> void fillStudentsCollection(Collection<S> students, StudentFactory<S> factory) {
		S s1 = factory.create("Jordan", "Jordanson", "1234567890");
		S s2 = factory.create("Joe", "Johnson", "5678901234");
		S s3 = factory.create("George", "Georgeson"	, "4567890123");
		S s4 = factory.create("Steve", "Stevenson", "2345678901");
		S s5 = factory.create("Poe", "Edgar Allan", "2345678901");

		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
	}
}
