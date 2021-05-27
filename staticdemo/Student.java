package com.technoelevate.staticdemo;

public class Student 
{
	int rollNum;
	String name;
	String grade;
	static String schoolName;
	static int count = 0;
	
	static {
		schoolName = "Deepayan School";
	}
	public Student() {
		count++;
	}
	
	
}
