package com.interviewcoding;

import java.util.Scanner;

public class PrimeNumbersInRange {

	private static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting and ending number: ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		for (int num = start; num <= end; num++) {
			if (isPrime(num)) {
				System.out.print(num + " ");
			}
		}

	}

}
