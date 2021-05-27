package com.technoelevate.strings;

public class ComparingRef {

	public static void main(String[] args) {
		String s1 = "sachin";
		String s2 = "saurav";
		String s3 = "Shashank"+"Sheelavantmath";
		String s4 = s1+s2;
		System.out.println(s1.codePointAt(2));
		System.out.println(s1.contains("achin"));
		System.out.println(s1.compareTo(s2));
		
		int i = s1.compareTo(s2);
		System.out.println(i);
		
		
//		if(s3==s4) {
//			System.out.println("Refereneces are same");
//		}else {
//			System.out.println("Refereneces are not same");
//		}
	}

}
