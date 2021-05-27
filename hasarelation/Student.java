package com.technoelevate.hasarelation;

public class Student 
{
	Heart h = new Heart(80, 70);
	
	Brain b = new Brain(1, 120);
	
	void hasBook(Book b) {
		System.out.println(b.author);
		System.out.println(b.title);
	}
	void hasBike(Bike b) {
		System.out.println(b.mileage);
		System.out.println(b.brand);
	}
}
