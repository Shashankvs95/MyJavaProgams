package com.technoelevate.operators;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x>y && x>z) {
			System.out.println("largest is: "+x);
		}else if(y>z) {
			System.out.println("Largest is:"+y);
		}else {
			System.out.println("Largest is :"+z);
		}
	}

}
