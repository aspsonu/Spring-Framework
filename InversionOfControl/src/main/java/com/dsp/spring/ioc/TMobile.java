package com.dsp.spring.ioc;

public class TMobile implements Sim{

	@Override
	public void calling() {
		System.out.println("Calling using t-mobile network");
	}

	@Override
	public void data() {
		System.out.println("Browsing using t-mobile network");
	}

}
