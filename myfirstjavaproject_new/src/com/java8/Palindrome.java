package com.java8;

import java.util.function.Predicate;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Main method started");
		Predicate<String> isPalindrome = (s) -> {
			String original = s.toLowerCase();
			String rev = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				rev = rev + original.charAt(i);
			}
			return rev.equals(original);

		};
		System.out.println(isPalindrome.test("madaM"));
	}

}
