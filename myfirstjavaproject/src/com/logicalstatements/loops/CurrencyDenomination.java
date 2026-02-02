package com.logicalstatements.loops;

import java.util.Scanner;

public class CurrencyDenomination {

	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println("*************************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount");
		int amount = sc.nextInt();
		System.out.println("Denominations in terms of 2000,500,200,100,50,20,10,5,2,1");
		int[] notes = { 2000, 500, 200, 100, 50, 20, 10, 5, 1 };
		for (int note : notes) {
			if (amount >= note) {
				int count = amount / note;
				System.out.println(note + " X " + count);
				amount = amount % note;
			}
		}
//		while (amount > 0) {
//			if (amount >= 2000) {
//				int noteCount = amount / 2000;
//				System.out.println("2000 X " + noteCount);
//				amount %= 2000;
//			} else if (amount >= 500) {
//				int noteCount = amount / 500;
//				amount %= 500;
//				System.out.println("500 X " + noteCount);
//			} else if (amount >= 200) {
//				int noteCount = amount / 200;
//				amount %= 200;
//				System.out.println("200 X " + noteCount);
//			} else if (amount >= 100) {
//				int noteCount = amount / 100;
//				System.out.println("100 X " + noteCount);
//				amount %= 100;
//			} else if (amount >= 50) {
//				int noteCount = amount / 50;
//				System.out.println("50 X " + noteCount);
//				amount %= 50;
//			} else if (amount >= 20) {
//				int noteCount = amount / 20;
//				System.out.println("20 X " + noteCount);
//				amount %= 20;
//			} else if (amount >= 10) {
//				int noteCount = amount / 10;
//				System.out.println("10 X " + noteCount);
//				amount %= 10;
//			} else if (amount >= 5) {
//				int noteCount = amount / 5;
//				System.out.println("5 X " + noteCount);
//				amount %= 5;
//			} else if (amount >= 2) {
//				int noteCount = amount / 2;
//				System.out.println("2 X " + noteCount);
//				amount %= 2;
//			} else if (amount >= 1) {
//				int noteCount = amount / 1;
//				System.out.println("1 X " + noteCount);
//				amount %= 1;
//			}
//		}
		sc.close();
	}
}
