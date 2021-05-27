package com.technoelevate.hasarelation;

public class AgreeCompoMain 
{
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		
		Charger charger = new Charger("SONY",5f);
		
		System.out.println(mobile.os.name);
		System.out.println(mobile.os.version);
		
		mobile.hasA(charger);
		mobile=null;
		
		System.out.println(charger.brand);
	}
}
