package hr.oop.practice.streams;

import java.util.List;

public class Example6B {

	public static void main(String[] args) {
		List<Student> students = StudentData.load();
		int threshold = 20;
		students
		.stream()
		.filter( s -> s.getPoints() > threshold)
		.mapToInt( s -> s.getPoints())
		.average()
		.ifPresentOrElse(avg -> 
		System.out.println("Average points for students above threshold " + avg), () -> 
		System.out.println("Stream contains no data"));

	}
}
