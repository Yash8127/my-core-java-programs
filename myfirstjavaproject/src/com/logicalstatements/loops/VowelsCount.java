package com.logicalstatements.loops;

public class VowelsCount {

	static void findVowels(String s) {
		int count = 0;
		int n = s.length();
		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				count++;

			}
		}
		System.out.println("Number of Vowels: " + count);
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		String s = "hello world";

		findVowels(s);
	}

}
