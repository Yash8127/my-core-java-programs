package com.interviewcoding;

public class MissingNumberXOR {
	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 5};

		int xor1 = 0;
		int xor2 = 0;

		for (int i = 1; i <= 5; i++) {
			xor1 ^= i;
		}

		for (int num : arr) {
			xor2 ^= num;
		}

		System.out.println("Missing Number: " + (xor1 ^ xor2));
	}
}