package com.technoelevate.operators;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println("Num 1 is greater");
		}
		else if(num2>num1) {
			System.out.println("Num 2 is greater");
		}else {
			System.out.println("Opps!!");
		}

	}
}
