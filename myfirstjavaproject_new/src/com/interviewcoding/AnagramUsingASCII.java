package com.interviewcoding;

public class AnagramUsingASCII {

	public static void main(String[] args) {

		String str1 = "listen";
		String str2 = "silent";

		if (isAnagram(str1, str2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
	}

	public static boolean isAnagram(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}

		int[] count = new int[256];

		for (int i = 0; i < str1.length(); i++) {
			count[str1.charAt(i)]++;
			count[str2.charAt(i)]--;
		}

		for (int value : count) {
			if (value != 0) {
				return false;
			}
		}

		return true;
	}
}