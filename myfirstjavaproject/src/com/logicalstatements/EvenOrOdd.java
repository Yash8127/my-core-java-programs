package com.logicalstatements;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int a = sc.nextInt();
		if((a&1)==0)
			System.out.println("even");
		else
			System.out.println("odd");
		sc.close();

	}

}
