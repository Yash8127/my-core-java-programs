package com.logicalstatements.loops;

import java.util.Scanner;

public class Divisiors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		System.out.print("Divisors of a given number is:");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				System.out.print(i + ",");
		}
		sc.close();
	}

}
