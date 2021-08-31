package hr.oop.main.collections.example6;

import java.util.Comparator;

import hr.oop.main.collections.example4.Student4;

public class StudentComparator implements Comparator<Student4> {

	@Override
	public int compare(Student4 o1, Student4 o2) {
		// TODO Auto-generated method stub
		int r = o1.getLastName().compareTo(o2.getLastName());
		if(r!=0) return r;
		r = o1.getFirstName().compareTo(o2.getFirstName());
		if(r!=0) return r;
		return o1.getStudentID().compareTo(o2.getStudentID());
	}
	

}
