package com.technoelevate.abstraction;

public abstract class Shape {
	
	double area;
	
	abstract void acceptInput();
	
	abstract void compute();
	
	void Display() {
		System.out.println("Area is: "+area);
	}
	void select(Shape s) {
		s.acceptInput();
		s.compute();
		s.Display();
	}

}
