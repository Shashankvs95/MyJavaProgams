package com.technoelevate.inheritance;

public class MobileMain 
{
	public static void main(String[] args) {
		CameraMobile cm = new CameraMobile();
		MusicMobile mm = new MusicMobile();
		
//		cm.playMusic();
//		cm.camera();
//		cm.browse();
//		System.out.println();
//		
//		mm.playMusic();
//		mm.camera();
//		mm.browse();
//		System.out.println();
		
		Mobile m1 = mm;
		m1.playMusic();
		m1.camera();
		m1.browse();
		((MusicMobile)m1).playGoodMusic();
		System.out.println();
		
		Mobile m2 = cm;
		m2.playMusic();
		m2.camera();
		m2.browse();
		((CameraMobile)m2).goodCamera();
		
		
	}
}
