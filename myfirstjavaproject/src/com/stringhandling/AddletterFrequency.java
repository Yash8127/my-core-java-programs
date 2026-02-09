package com.stringhandling;

public class AddletterFrequency {

	public static void main(String[] args) {
		System.out.println("main method started");
		String str = "aaabbb";
		String result = "";
		int count = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				result = result + str.charAt(i) + count;
				count = 1;// count reset for next character
			}

		}
		// handling last character
		result = result + str.charAt(str.length() - 1) + count;
		System.out.println(result);
	}

}
