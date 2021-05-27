package com.technoelevate.hasarelation;

public class Mobile {
	OperatingSystem os = new OperatingSystem("Android", 10);
	
	public void hasA(Charger c) {
		System.out.println(c.getBrand());
		System.out.println(c.voltage);
	}

}
