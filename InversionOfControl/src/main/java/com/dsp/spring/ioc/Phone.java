package com.dsp.spring.ioc;

import org.springframework.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Phone {

	public static void main(String[] args) {
		
		/*
		 * Here if we want to use a particular sim card
		 * That particular cards object needs to be created in order to use it
		 * For example :
		 * As per requirements currently we are using airtel sim and hence that object is created
		 * In future if we want to migrate to t - mobile network then again the source code needs to be changed 
		 * That is again a new object of t-mobile needs to be created in order to use it 
		 * Which is a bad thing, because every time one should not touch source code always
		 */
		
		/*
		 * The below mentioned is all used in java with respect to objects
		 * Airtel airtelRef = new Airtel();
		airtelRef.calling();
		airtelRef.data();
		
		TMobile tMobile = new TMobile();
		tMobile.calling();
		tMobile.data();
		
		Sim sim = new Airtel();
		sim.calling();
		sim.data();
		
		Sim simRef = new TMobile();
		simRef.calling();
		simRef.data();
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config Loaded");
		
		
		Airtel airtel = (Airtel) context.getBean("airtel");
		//Here if we don't type cast Airtel then it throws an error because we are trying to get the object of type airtel
		airtel.calling();
		airtel.data();
		
		TMobile tMobile = context.getBean("tmobile", TMobile.class);
		tMobile.calling();
		tMobile.data();
		
		Sim sim = context.getBean("sim", Sim.class);
		sim.data();		
	}

}
