package com.logicalstatements;

import java.util.Scanner;

public class PostiveOrNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		if(a>=0)
			System.out.println("postive");
		else 
			System.out.println("negative");
		sc.close();

	}

}
