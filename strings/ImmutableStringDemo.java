package com.technoelevate.strings;


public class ImmutableStringDemo {
	
	public static void main(String[] args) {
		String s1 = new String("Shashank");
		String s2 = new String("Shashank");
//		System.out.println(s1);
//		System.out.println(s2);
//		
//		String s3 = s1.concat(" Sheelavantmath");
//		System.out.println(s3);
		
		
		
		if(s1.equals(s2)) {
			System.out.println("Contents are same");
		}else {
			System.out.println("contents are not same");
		}
	}

}
