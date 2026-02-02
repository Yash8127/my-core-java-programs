package com.logicalstatements.loops;

import java.util.Scanner;

public class FindSumOfDigitsInANumberUptoSingleDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int r = 0;
		int sum = 0;
		while (n > 9) {
			sum = 0;
			while (n != 0) {
				r = n % 10;
				n /= 10;
				sum += r;
			}
			n = sum;
		}

		System.out.println(sum);
		sc.close();
	}

}
