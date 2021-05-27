package com.technoelevate.staticdemo;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.rollNum=1;
		s1.name="Shashank";
		s1.grade="10th";
		
		Student s2 = new Student();
		s2.rollNum=2;
		s2.name="Sandeep";
		s2.grade="9th";
		
		
		System.out.println(s1.rollNum);
		System.out.println(s1.name);
		System.out.println(s1.grade);
		System.out.println(s1.schoolName);
		System.out.println();
		
		System.out.println(s2.rollNum);
		System.out.println(s2.name);
		System.out.println(s2.grade);
		System.out.println(s2.schoolName);
		System.out.println();
		
		System.out.println(s1.count);
		System.out.println(s2.count);
		
		
	}

}
