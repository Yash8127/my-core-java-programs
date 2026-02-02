package com.logicalstatements.loops;

import java.util.Scanner;

public class FizzBuzz {

	static void fizzBuzz(int n) {
		if (n % 3 == 0 && n % 5 == 0) {
			System.out.println("FizzBuzz");
		} else if (n % 3 == 0) {
			System.out.println("Fizz");
		} else if (n % 5 == 0) {
			System.out.println("Buzz");
		} else
			System.out.println(n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			fizzBuzz(i);
		}
		sc.close();
	}

}
