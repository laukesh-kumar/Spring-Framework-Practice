package com.spring.beans;

public class Student {
	private String sName;
	private String sRoll;
	private Course course;
	
	public Student(String sName, String sRoll, Course course) {
		this.sName=sName;
		this.sRoll=sRoll;
		this.course=course;
	}
	
	public void getStudentDetails() {
		System.out.println("Student Details");
		System.out.println("-----------------------------");
		System.out.println("Student Name       : "+sName);
		System.out.println("Stundet Roll Number: "+sRoll+"\n");
		System.out.println("Student Course");
		System.out.println("Course Name        : "+course.getcName());
		System.out.println("Course Cost        : "+course.getcCost());
	}
}
