package com.whileloop;

import java.util.Scanner;

public class DecimalToBinary {

	static void convertToBinary(int n) {
		int r = 0;
		int original = n;
		String revb = "";
		while (n != 0) {
			r = n % 2;// 25%2->1,12%2->0,6%2->0,3%2->1,1%2->
			n /= 2;// 25/2->12, 12/2->6, 3/2->1 , 1/2->0
			revb = r + revb;
		}
//		for (int i = 0; i < revb.length(); i++) {
//			char bits = revb.charAt(i);
//
//			System.out.print(bits + " ");
//		}
		System.out.println("Binary number of " + original + " is: " + revb);
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		convertToBinary(n);
		sc.close();
	}

}
