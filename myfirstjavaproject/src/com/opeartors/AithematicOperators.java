package com.opeartors;

import java.util.Scanner;

public class AithematicOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("enter b number");
		int b = sc.nextInt();
		System.out.println("addition: " + (a + b));
		System.out.println("subraction: " + (a - b));
		System.out.println("multiplicatin:" + a * b);
		System.out.println("division:" + a / b);
		System.out.println("modulus: " + a % b);
		sc.close();
	}

}
