package com.interviewcoding;

public class SumOfDigits {

	public static void main(String[] args) {

		String number = "12345";

		int sum = 0;

		for (char ch : number.toCharArray()) {
			sum += ch - '0';
		}

		System.out.println(sum);
	}
}