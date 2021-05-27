package com.technoelevate.abstraction;

public class AbstractMain 
{
	public static void main(String[] args) {
//		Selection sel = new Selection();
		
		Shape s = new Rectangle();
		s.select(s);
		System.out.println();
		
		s= new Square();
		s.select(s);
		
	}
}
