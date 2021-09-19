package hr.oop.practice.streams;

import java.util.List;
import java.util.stream.Stream;

public class Example3 {
	public static void main(String[] args) {
		List<Student> students = StudentData.load();
		Stream<Student> st = students.stream();
		st.forEach(o -> System.out.println(o));
	
		try {
			st.forEach(o -> System.out.println(o));
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
		students.stream().forEach(o->System.out.println(o));
	}
	
}
