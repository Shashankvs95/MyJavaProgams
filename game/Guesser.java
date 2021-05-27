package com.technoelevate.game;

import java.util.Scanner;

public class Guesser 
{
	int gnum;
	
	int guessNum() {
		System.out.println("Guesser kindly guess the number");
		Scanner scan = new Scanner(System.in);
		gnum = scan.nextInt();
		scan.close();
		return gnum;
	}
}
