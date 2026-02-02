package com.logicalstatements.loops;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		long num = sc.nextInt();
		int count = 0;
		for (long i = num; i != 0; i/=10) {
			count++;
		}
		System.out.println(count);
	}

}
