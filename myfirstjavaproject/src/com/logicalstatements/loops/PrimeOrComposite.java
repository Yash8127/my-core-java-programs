package com.logicalstatements.loops;

import java.util.Scanner;

public class PrimeOrComposite {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int count = 0;
		System.out.print("Factors of given number is: ");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + ",");
				count++;
			}

		}
		if (count == 2) {
			System.out.println();
			System.out.println("Prime number");
		} else {
			System.out.println();

			System.out.println("Composite number");
		}
		sc.close();
	}

}
