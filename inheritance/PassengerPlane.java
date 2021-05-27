package com.technoelevate.inheritance;

public class PassengerPlane extends Plane 
{
	void fly() {
		System.out.println("Passenger plane flies at low level");
	}
	void carryPassenger() {
		System.out.println("Carries passenger -- Sub-class specific method");
	}
}
