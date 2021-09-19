package hr.oop.practice.streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = StudentData.load();
		int threshhold = 20;
		
		Double avgGrade = students.stream()
				.filter(new Predicate<Student>(){
					@Override
					public boolean test (Student s) {
						return s.getPoints() > threshhold;
					}
				})
				.mapToInt(new ToIntFunction<Student>(){
					@Override 
					public int applyAsInt(Student s ) {
						return s.getPoints();
					}
				})
				.average()
				.getAsDouble();
		System.out.println("Average grade is " + avgGrade);
		
		Double avgGrade2 = students.stream()
				.filter(s->s.getPoints()>threshhold)
				.mapToInt(s -> s.getPoints())
				.average().getAsDouble();
		System.out.println("Average grade is " + avgGrade2);

	}

}
