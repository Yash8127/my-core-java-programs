package com.logicalstatements;

import java.util.Scanner;

public class SwitchCase1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("enter b number");
		int b = sc.nextInt();
		String s = "1.addition\n" + "2.subtraction\n" + "3.multiplication\n" + "4.division";
		System.out.println("*****************");
		System.out.println(s);
		System.out.println("Enter your choice number:");
		int choice = sc.nextInt();
		switch (choice) {
		case 1 -> System.out.println(a + b);
		case 2 -> System.out.println(a - b);
		case 3 -> System.out.println(a * b);
		case 4 -> System.out.println(a / b);
		default -> System.out.println("invalid");
		}
		sc.close();

	}

}
