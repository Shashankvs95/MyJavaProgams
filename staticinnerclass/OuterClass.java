package com.technoelevate.staticinnerclass;

public class OuterClass 
{
	static int a = 10;
	static class InnerClass
	{
		void msg() {
			System.out.println("Number is "+a);
		}
	}
	public static void main(String[] args) {
		OuterClass.InnerClass OI = new OuterClass.InnerClass();
		OI.msg();
	}
}
