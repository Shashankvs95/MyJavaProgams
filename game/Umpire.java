package com.technoelevate.game;

public class Umpire 
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	
	void collectNumFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();
	}
	
	void collectNumFromPlayer() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		numFromPlayer1 = p1.guessNum();
		numFromPlayer2 = p2.guessNum();
		numFromPlayer3 = p3.guessNum();
		
	}
	
	void Compare() {
		if(numFromGuesser == numFromPlayer1) {
			System.out.println("Player 1 is the winner");
		}
		else if(numFromGuesser == numFromPlayer2) {
			System.out.println("Player 2 is the winner");
		}
		else if(numFromGuesser == numFromPlayer3) {
			System.out.println("Player 3 is the winner");
		}
		else {
			System.err.println("Ooops, sorry! Try again.");
		}
	}
	
}
