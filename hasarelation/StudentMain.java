package com.technoelevate.hasarelation;

public class StudentMain {
	public static void main(String[] args) {
		Student s = new Student();
		
		Bike b = new Bike("BMW", 55.5f);
		
		System.out.println(s.b.iq);
		System.out.println(s.b.weight);
		System.out.println();
		
		System.out.println(s.h.heartBeat);
		System.out.println(s.h.weight);
		
		s.hasBike(b);
	}

}
