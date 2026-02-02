package com.logicalstatements.loops;

import java.util.Scanner;

public class FactUsingRecurision {

	// method to find factorial of program
	static long findFact(long n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * findFact(n - 1);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		long n = sc.nextLong();
		long fact = findFact(n);
		System.out.println("Factorial of a given number is: "+fact);
		sc.close();

	}

}
