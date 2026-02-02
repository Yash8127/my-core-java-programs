package com.logicalstatements;

import java.util.Scanner;

public class DivisibleCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		if (a % 5 == 0 && a % 11 == 0)
			System.out.println("Divisible");
		else
			System.out.println("not divisible");
		sc.close();
	}

}
