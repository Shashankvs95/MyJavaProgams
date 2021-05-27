package com.technoelevate.operators;

import java.util.Scanner;

public class Precedence 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = sc.nextInt();
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();
		System.out.println("Enter the value of c:");
		int c = sc.nextInt();
		sc.close();
		
		int res = a- ++b- ++c;
		System.out.println("a - ++b - ++c : "+res);
	}
}
