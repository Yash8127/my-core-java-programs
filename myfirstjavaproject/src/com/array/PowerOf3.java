package com.array;

import java.util.Scanner;

public class PowerOf3 {

	static boolean isPowerOf3(int n) {
		if (n < 0) {
			return false;
		}
		while (n % 3 == 0) {
			n /= 3;
		}
		return n == 1;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("************************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println(isPowerOf3(n));
		sc.close();
	}

}
