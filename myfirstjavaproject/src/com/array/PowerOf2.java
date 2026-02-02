package com.array;

import java.util.Scanner;

public class PowerOf2 {
	static boolean isPower(int n) {
		if (n < 0) {
			return false;
		}
		return (n & (n - 1)) == 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println(isPower(n));
		sc.close();
	}

}
