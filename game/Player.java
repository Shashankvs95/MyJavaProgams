package com.technoelevate.game;

import java.util.Scanner;

public class Player 
{
	int pnum;
	
	int guessNum() {
		System.out.println("Player guess the number");
		Scanner scan = new Scanner(System.in);
		pnum = scan.nextInt();
		scan.close();
		return pnum;
	}	
}