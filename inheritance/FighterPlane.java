package com.technoelevate.inheritance;

public class FighterPlane extends Plane {
	void fly() {
		System.out.println("Fighter plane flies at higher height");
	}
	void carryWeapons() {
		System.out.println("Carries Weapons -- Sub-class specific method");
	}

}
