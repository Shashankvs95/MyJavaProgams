package com.technoelevate.constructors;

public class Dog 
{
	int age;
	String name;
	String breed;
	
	public Dog(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public Dog(int age, String name, String breed) {
		this.age=age;
		this.name=name;
		this.breed=breed;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}
	
}
