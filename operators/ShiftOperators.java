package com.technoelevate.operators;

import java.util.Scanner;

public class ShiftOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of X: ");
		int x = sc.nextInt();
		sc.close();
		System.out.println("----> "+(x+x*x/x));
		
		System.out.println("~x: "+~x);
		System.out.println("x>>4: "+(x>>4));
		
		
	}

}
