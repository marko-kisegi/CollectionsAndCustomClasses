package hr.oop.practice.streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Example5 {
	public static void main(String[] args) {
		List<Student> students = StudentData.load();
		
		List<String> lastNames = students.stream()
				.filter(new Predicate<Student>() {
					@Override
					public boolean test (Student s) {
						return s.getPoints() > 30;
					}
				})
				.map(new Function<Student, String>() {
					@Override
					public String apply(Student s) {
						return s.getLastName();
	
					}
				}).sorted()
				.collect(Collectors.toList());
		lastNames.stream().forEach( s -> System.out.println(s));
		System.out.println("----------");
		
		lastNames = students.stream()
				.filter(s -> s.getPoints() > 30)
				.map( s -> s.getLastName())
				.sorted()
				.collect(Collectors.toList());
		
		lastNames.stream().forEach(s -> System.out.println(s));
		
	}
}
