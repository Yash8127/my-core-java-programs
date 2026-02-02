package com.array;

public class FirstUniqueChar {

	public static void main(String[] args) {

		String str = "swiss";
		int[] freq = new int[256]; // ASCII characters

		// 1️⃣ Count frequency of each character
		for (int i = 0; i < str.length(); i++) {
			freq[str.charAt(i)]++;
		}

		// 2️⃣ Find first non-repeating character
		for (int i = 0; i < str.length(); i++) {
			if (freq[str.charAt(i)] == 1) {
				System.out.println("First non-repeating character: " + str.charAt(i));
				return;
			}
		}

		System.out.println("No non-repeating character found");
	}
}
