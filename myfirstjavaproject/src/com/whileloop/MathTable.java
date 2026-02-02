package com.whileloop;

import java.util.Scanner;

public class MathTable {

	public static void main(String[] args) {
		System.out.println("main method strted");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int i = 1;

		while (i <= 10) {

			System.out.println(n + "x" + i + "=" + n * i);
			i++;

		}

		System.out.println("main method ended");
	}

}
