package com.logicalstatements.loops;

import java.util.Scanner;

public class PerfectNum {
	static void isPerfect(int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0)
				sum += i;
		}
		if (num == sum)
			System.out.println("perfect number");
		else
			System.out.println("not perfect");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		isPerfect(num);
		
		sc.close();
	}

}
