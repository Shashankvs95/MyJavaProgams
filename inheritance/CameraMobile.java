package com.technoelevate.inheritance;

public class CameraMobile extends Mobile 
{
	int i=20;
	void goodCamera() {
		System.out.println("CyberShot 64MP camera -- Sub-class specific method");
		System.out.println(super.i);
	}
}
