package com.technoelevate.demoApp;

import java.util.Scanner;

public class ControlConstructs {

	public static void main(String[] args) {
//		int a = 25;
//		int b = 20;
////		boolean bool = a<b;
//		if(a<b) {
//			System.out.println("a is < than b");
//		}else {
//			System.out.println("a is > than b");
//		}
		
//		boolean isLoggeddIn = true;
//		boolean hasAccount = true;
//		boolean hasPaid = false;
//		 if(isLoggeddIn && hasAccount && hasPaid) {
//			 System.out.println("Give access to the code ");
//		 }
//		 else if(hasAccount && !isLoggeddIn){
//			 System.out.println("please login to access");
//		 }
//		 else if(isLoggeddIn && hasAccount && !hasPaid) {
//			 System.out.println("Please make payment to access");
//		 }
//		 else {
//			 System.out.println("Create an account");
//		 }
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the case value: ");
		int a = sc.nextInt();
		sc.close();
		switch (a) {
		case 1 : case 2: System.out.println("1 & 2 are printed");
			
			break;
		case 3: System.out.println("3 is printed");
		
		break;
		case 4: System.out.println("4 is printed");
		
		break;

		default: System.err.println("Default is printed");
		}
		
	}

}
