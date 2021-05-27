package com.technoelevate.patterns;

import java.util.Scanner;

public class Panagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str = sc.nextLine();
		boolean res = isPanagram(str);

		if (res) {
			System.out.println("is panagram");
		} else {
			System.out.println("is not a panagram");
		}
	}

	private static boolean isPanagram(String st) {
		if (st.length() < 26) {
			return false;
		}
		int count[] = new int[26];
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				count[ch - 97]++;
			} else if (ch >= 'A' && ch <= 'Z') {
				count[ch - 65]++;
			}
		}

		for (int i = 0; i < 26; i++) {
			if (count[i] == 0)
				return false;
		}
		return true;

	}
}
