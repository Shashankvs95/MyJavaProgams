package com.technoelevate.inheritance;

public class CargoPlane extends Plane 
{
	void fly() {
		System.out.println("Cargo plane flies at medium height");
	}
	void carryGoods() {
		System.out.println("Carries goods -- Sub-class specific method");
	}
}
