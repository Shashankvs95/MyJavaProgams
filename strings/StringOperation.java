package com.technoelevate.strings;

public class StringOperation {
	public static void main(String[] args) {
		String s1 = new String("Shashank");
		String s2 = new String("Shashank");
		String st = "Sandeep"+"S";
//		System.out.println(st);
//		System.out.println(s1);
//		System.out.println(s2);
		StringBuilder s = new StringBuilder("Shashank ");
//		s.insert("Sheelavanna");
		
		System.out.println(s);
		System.out.println(s.capacity());
		
		
		String s3 = s1.concat(" Sheelavantmath");
		System.out.println(s3);
	}
}
