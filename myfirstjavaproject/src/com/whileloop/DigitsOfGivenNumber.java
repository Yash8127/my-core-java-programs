package com.whileloop;

import java.util.Scanner;

public class DigitsOfGivenNumber {
	static int countDigits(int n) {
		int count = 0;
		while (n != 0) {
			n /= 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		int count = countDigits(a);
		System.out.println(count);
		sc.close();
	}
}
