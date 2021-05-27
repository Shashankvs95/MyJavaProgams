package com.technoelevate.interfacedemo;

public class Sony implements MobileInterface {

	@Override
	public void playMusic() {
		System.out.println("Sony plays music");

	}

	@Override
	public void openCam() {
		System.out.println("Sony has best camera");
	}

	@Override
	public void playGame() {
		System.out.println("Can play games");
	}

}
