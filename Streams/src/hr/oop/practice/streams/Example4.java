package hr.oop.practice.streams;

import java.util.List;

public class Example4 {

	public static void main(String[] args) {
		List<Student> students = StudentData.load();
		
		System.out.println("-Students with 40 points or more-");
		
		students.stream().filter( s -> s.getPoints() >= 40)
		.sorted(Student.BY_LAST_NAME)
		.forEach(s->System.out.println(s));
		
		System.out.println("All students are :");
		students.forEach(t->System.out.println(t));

	}
}
