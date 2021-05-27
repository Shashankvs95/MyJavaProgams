package com.technoelevate.inheritance;

public class Child extends Parent 
{
	int i;

	Child(){
		
		System.out.println("Child class constructor");
	}
	Child(int i){
		super(i);
		this.i=i;
		System.out.println("Child class parameterized constructor");
	}
}
