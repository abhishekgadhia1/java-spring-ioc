package com.practice;

public class Airtel implements Sim{
	
	

	public Airtel() {
		System.out.println("const called");
	}

	@Override
	public void calling() {
		System.out.println("calling from airtel sim");
		
	}

}
