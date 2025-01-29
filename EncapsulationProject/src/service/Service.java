package service;

import com.entity.Student;

public class Service {
	public Student m1() {
		Student s1 = null;
		// creating object of Student class and sent parameter to the constructor.
		s1 = new Student("Mayur",16,"A","B Tech",96000);
		return s1;
	}

}
