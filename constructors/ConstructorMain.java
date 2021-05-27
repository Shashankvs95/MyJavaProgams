package com.technoelevate.constructors;

public class ConstructorMain 
{
	public static void main(String[] args) {
		Dog d = new Dog(10, "Raju", "Husky");
		System.out.println(d.getAge());
		System.out.println(d.getName());
		System.out.println(d.getBreed());
		System.out.println();
		
		Dog d2 = new Dog(20, "Scooby");
		System.out.println(d2.getAge());
		System.out.println(d2.getName());
	}
}
