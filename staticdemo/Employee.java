package com.technoelevate.staticdemo;

public class Employee 
{
	int id;
	String name;
	int salary;
	static String company;
	static int count = 0;
	
	static {
		company = "Google";
	}
	
	public Employee() {
		count++;
	}
	
}
