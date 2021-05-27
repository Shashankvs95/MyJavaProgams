package com.technoelevate.arraysDemo;

import java.util.Scanner;

public class Arrays {
	

	public static void main(String[] args) 
	{
		int[] arr = new int[5];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the array elements: "+i);
			arr[i]=scan.nextInt();
			scan.close();
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Array elements: "+arr[i]);
		}
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum+arr[i];
			
		}
		System.out.println("Sum is:"+sum);
		
		int largest = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]>largest)
				largest = arr[i];
		}System.out.println("Largest of array element is: "+largest);
	}

}
