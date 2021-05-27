package com.technoelevate.interfacedemo;

public class Apple implements MobileInterface {

	@Override
	public void playMusic() {
		System.out.println("iPhone plays music");
	}

	@Override
	public void openCam() {
		System.out.println("iPhone has cool camera");
	}

	@Override
	public void playGame() {
		System.out.println("we play games in iPhone");
	}

}
