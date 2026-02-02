package com.logicalstatements.loops;

import java.util.Scanner;

public class ReverseNum {

	static int revNum(int n) {
		int r = 0;
		int rev = 0;
		while (n != 0) {
			r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int rev = revNum(n);
		System.out.println(rev);
		sc.close();
	}

}
