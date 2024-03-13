package com.dsp.spring.DependencyInjection;

public class Student {
	
	private int id;
	
	private String studentName;
	
	public Student() {
		System.out.println("Inside Student Class");
	}
	
	public Student(int id) {
		this.id = id;
	}

	public Student(String studentName, int id) {
		this.studentName = studentName;
		this.id = id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setStudentName(String studentName) {
		System.out.println("Inside setStudentName method");
		this.studentName = studentName;
	}
	
	public void displayInfo() {
		System.out.println("Student name : " + studentName + " and id : " + id);
	}
}
