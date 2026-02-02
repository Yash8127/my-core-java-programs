package com.logicalstatements.loops;

import java.util.Scanner;

public class ArmstrongNum {

	static int armStrong(int n) {
		int temp =n;
		int digit = 0;
		int sumP = 0;
		int count = 0;
		for (int i = n; n != 0; n /= 10) {
			count++;
		}
		while (temp != 0) {
			digit = temp % 10;
			temp = temp / 10;
			sumP = (int) (sumP + Math.pow(digit,count));
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
