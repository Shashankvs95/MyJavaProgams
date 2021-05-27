package com.technoelevate.game;

public class GuesserGameMain {

	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.Compare();
	}

}
