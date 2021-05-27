package com.technoelevate.inheritance;

public class PlaneMain {

	public static void main(String[] args) {
		PassengerPlane pp = new PassengerPlane();
		CargoPlane cp = new CargoPlane();
		FighterPlane fp = new FighterPlane();
		
//		pp.takeOff();
//		pp.fly();
//		pp.land();
//		System.out.println();
//		
//		cp.takeOff();
//		cp.fly();
//		cp.land();
//		System.out.println();
//		
//		fp.takeOff();
//		fp.fly();
//		fp.land();
		
		Plane p1 = pp;
		p1.takeOff();
		p1.fly();
		p1.land();
		((PassengerPlane) p1).carryPassenger();
		System.out.println();
		
		Plane p2 = cp;
		p2.takeOff();
		p2.fly();
		p2.land();
		((CargoPlane) p2).carryGoods();
		System.out.println();
		
		Plane p3 = fp;
		p3.takeOff();
		p3.fly();
		p3.land();
		((FighterPlane)p3).carryWeapons();
		System.out.println();
	}

}
