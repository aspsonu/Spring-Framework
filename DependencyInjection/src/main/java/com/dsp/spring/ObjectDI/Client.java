package com.dsp.spring.ObjectDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		/*
		 * Student student = new Student();
		 * student.setId(100);
		 * MathCheat cheat = new MathCheat();
		 * student.setMathCheat(cheat);
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		System.out.println("Config file loaded");
		Student student = context.getBean("stud", Student.class);
		student.cheating();
		
		AnotherStudent anotherStudent = context.getBean("anotherStudent", AnotherStudent.class);
		anotherStudent.startCheating();
	}

}
