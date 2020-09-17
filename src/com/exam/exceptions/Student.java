package com.exam.exceptions;

public class Student {

	private String name;
	private int age;
	
	Student(String name, int age) throws AgeDoesnotMatchException{
		this.name = name;
		this.age = age;
		if(age>17 && age<24) {
			throw new AgeDoesnotMatchException("Exception Occurs. Your value is between 17 and 24");
		}
		System.out.println("All works");
	}
	
	public static void main(String[] args) throws AgeDoesnotMatchException {
		Student s1 = new Student("Ronak", 24);
		Student s2 = new Student("Ronak", 19);
		
	}

}
