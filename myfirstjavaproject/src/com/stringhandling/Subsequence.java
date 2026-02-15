package com.stringhandling;

public class Subsequence {

	private static boolean isSub(String s1, String s2) {
		boolean flag = false;
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			flag = false;
			for (int j = 0; j < s2.length(); j++) {
				if (ch == s2.charAt(j)) {
					flag = true;
				}
			}

		}

		return flag;
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println(isSub("yaswanth", "yaswanthvarma"));
	}

}
