package com.technoelevate.operators;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		int x = sc.nextInt();
		System.out.println("Enter the value of y: ");
		int y = sc.nextInt();
		sc.close();
		System.out.println("The value of x | y is: "+(x|y));
		System.out.println("The value of x & y is: "+(x&y));
		System.out.println("The value of x ^ y is: "+(x^y));
		System.out.println("The value of x ~ y is: "+(x&~y));
		
		
		
	}

}
