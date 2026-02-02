package com.logicalstatements.loops;

import java.util.Scanner;

public class Armstrong3Num {
	static int armStrong(int n) {
		int r = 0;
		int sumP = 0;
		while (n != 0) {
			r = n % 10;
			n = n / 10;
			sumP = sumP + r * r * r;
		}
		return sumP;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int temp = n;
		int sumP = armStrong(n);
		if (sumP == temp)
			System.out.println("The Given number is an armstrong number");
		else
			System.out.println("The Given number is not an armstrong number");
		sc.close();

	}

}
