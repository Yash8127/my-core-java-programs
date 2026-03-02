package com.whileloop;

import java.util.Scanner;

public class CountSetBits {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		while (num > 0) {

			if ((num & 1) == 1) {
				count++;
			}
			num = num >> 1;

		}
		System.out.println("Number of One bits in given number: " + count);

		sc.close();
	}

}
