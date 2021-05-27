package com.technoelevate.operators;

import java.util.Scanner;

public class ListEven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println(num+" is even");
		}else {
			System.out.println(num+" is odd");
		}
		

	}

}
