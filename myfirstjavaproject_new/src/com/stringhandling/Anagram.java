package com.stringhandling;

import java.util.Scanner;

public class Anagram {

	private static boolean isAnagram(String s1, String s2) {

		s1 = s1.replaceAll("\\s", "").toLowerCase();
		s2 = s2.replaceAll("\\s", "").toLowerCase();
		if (s1.length() != s2.length()) {
			return false;
		}
		int[] count = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			count[s1.charAt(i) - 'a']++;
			count[s2.charAt(i) - 'a']--;
		}

		for (int c : count) {
			if (c != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first String");
		String s1 = sc.next();
		System.out.println("Enter a Second String ");
		String s2 = sc.next();
		System.out.println(isAnagram(s1, s2) ? "Anagram" : "not a anagram");
	}

}
