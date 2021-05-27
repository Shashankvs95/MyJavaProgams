package com.technoelevate.inheritance;

public class Parent 
{
	int i,j;
	
	Parent(){
		System.out.println("Parent class constructor");
	}
	Parent(int i){
		this(i,i);
		this.i=i;
		System.out.println("Parent class single parameterized constructor");
	}
	Parent(int i,int j){
//		this(i);
		this.i=i;
		this.j=j;
		System.out.println("Parent class two parameterized constructor");
	}
	
	void msg() {
		System.out.println("Parent class Method");
	}
}
