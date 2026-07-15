package com.interviewcoding;

public class ReverseEachWord {

	public static void main(String[] args) {

		String str = "Java Spring Boot";

		String[] words = str.split(" ");

		StringBuilder result = new StringBuilder();

		for (String word : words) {
			result.append(new StringBuilder(word).reverse()).append(" ");
		}

		System.out.println(result.toString().trim());
	}
}