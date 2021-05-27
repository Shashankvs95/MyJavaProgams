package com.technoelevate.interfacedemo;

public interface MobileInterface {
	void playMusic();
	void openCam();
	void playGame();
	
	default void Select(MobileInterface mi){
		mi.playMusic();
		mi.openCam();
		mi.playMusic();
		
	}
}
