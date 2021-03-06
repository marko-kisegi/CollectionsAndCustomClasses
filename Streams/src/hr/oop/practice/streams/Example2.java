
package hr.oop.practice.streams;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Example2 {
	public static void main(String[] args) {
		List<Student> students = StudentData.load();
		students.stream().filter(new Predicate<Student>(){
			@Override
			public boolean test(Student t) {
				return t.getPoints() >= 40;
			}
		}).forEach(new Consumer<Student>() {
			@Override
			public void accept(Student t) {
				System.out.println(t);
			}
		});
		
	}
}

