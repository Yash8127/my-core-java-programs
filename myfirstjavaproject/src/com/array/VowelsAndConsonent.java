package com.array;

import java.util.Scanner;

public class VowelsAndConsonent {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence that you want to count vowels and consonats: ");
		String s = sc.nextLine();
		int countv = 0;
		int countc = 0;
		s = s.toLowerCase();
		s = s.replaceAll("\\s+", "");
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				countv++;
			} else {
				countc++;
			}

		}

		System.out.println("vowels count: " + countv);
		System.out.println("consonats count: " + countc);
	}

}
