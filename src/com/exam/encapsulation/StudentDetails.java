package com.exam.encapsulation;

public class StudentDetails {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setStudentName("Ronak");
		s1.setStudentAge(24);
		s1.setDepartment("Computer Engineering");
		System.out.println(s1.getStudentName());
		System.out.println(s1.getStudentAge());
		System.out.println(s1.getDepartment());
	}

}
