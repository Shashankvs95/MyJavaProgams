package com.technoelevate.abstraction;

import java.util.Scanner;

public class Rectangle extends Shape {
	Scanner sc = new Scanner(System.in);
	float length;
	float breadth;
	

	@Override
	void acceptInput() {
		System.out.println("Ener length and nreadth:");
		length = sc.nextFloat();
		breadth = sc.nextFloat();
		
	}

	@Override
	void compute() {
		area = length*breadth;
		
	}

}
