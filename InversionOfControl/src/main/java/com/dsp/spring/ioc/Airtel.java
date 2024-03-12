package com.dsp.spring.ioc;

public class Airtel implements Sim{

	public Airtel() {
		System.out.println("In side of the airtel !");
	}
	@Override
	public void calling() {
		System.out.println("Calling using airtel network");	
	}

	@Override
	public void data() {
		System.out.println("Browsing using airtel network");
	}

}
