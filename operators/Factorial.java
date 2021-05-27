package com.technoelevate.operators;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the number: ");
		int num = sc.nextInt();
        long factorial = fact(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static long fact(int n)
    {
        if (n == 1)
            return 1;
        else
            return n * fact(n - 1);
    }

}
