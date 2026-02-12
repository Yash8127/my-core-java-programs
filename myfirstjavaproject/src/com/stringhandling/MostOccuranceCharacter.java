package com.stringhandling;

import java.util.Scanner;

public class MostOccuranceCharacter {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String:");
		String s = sc.next();
		int[] count = new int[127];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			count[ch] = count[ch] + 1;
		}
		char result = ' ';
		int max = -1;
		for (int i = 0; i < s.length(); i++) {
			if (count[s.charAt(i)] > max) {
				max = count[s.charAt(i)];
				result = s.charAt(i);
			}

		}
		System.out.println(result + " is the most occurring character (" + max + " times)");

	}

}
