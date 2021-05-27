package com.technoelevate.interfacedemo;

public class MobInterfaceMain 
{
	public static void main(String[] args) {
		MobileInterface m1 = new Apple();
		m1.Select(m1);
		System.out.println();
		m1 = new Sony();
		m1.Select(m1);
		
//		Sony s = new Sony();
//		
//		Apple a = new Apple();
//		
//		s.playMusic();
//		s.playMusic();
//		s.playGame();
//		System.out.println();
//		
//		a.playMusic();
//		a.openCam();
//		a.playGame();
	}
}
