package com.dsp.spring.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		//The below code is to use DI using setter injection
		Student student = context.getBean("student",Student.class);
		student.displayInfo();
		
		Student xyzStudent = context.getBean("xyz", Student.class);
		xyzStudent.displayInfo();
		
		//The below code is to use DI using Constructor Injection
		Student student2 = context.getBean("name", Student.class);
		student2.displayInfo();
		
		Student student3 = context.getBean("abc", Student.class);
		student3.displayInfo();
	}

}
