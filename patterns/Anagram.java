package com.technoelevate.patterns;

import java.util.Scanner;

public class Anagram 
{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first string");
		String s1=scan.nextLine();//"SILENT"
		System.out.println("enter second string");
		String s2=scan.nextLine();//"LISTEN"

		scan.close();
		System.out.println(isAnagram(s1, s2));
	}
	static boolean isAnagram(String st1, String st2){
		int[] c1=freqAlph(st1);
		int[] c2=freqAlph(st2);
		for(int i=0; i<26; i++){
			if(c1[i]!=c2[i])
				return false;
		}
		return true;
	}
	static int[] freqAlph(String s){  // s=SILENT
		int count[]=new int[26];         // it will create array of 26 length 0 to 25  
		for(int i=0; i<s.length(); i++){
			char ch=s.charAt(i);            //at i=0, ch will contain S
			if(ch>='A' && ch<='Z')           //true
				count[ch-65]++;                //[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0]
			else if(ch>='a' && ch<='z')     // if s is small it will add one at same index as above
				count[ch-97]++;
		}
		return count;
	}
}

