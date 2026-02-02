package com.whileloop;

import java.util.Scanner;

public class BinaryToDecimal {

	static int converToDecimal(String binary) {
		int decimal = 0;
		int length = binary.length();
		for (int i = 0; i < length; i++) {
			char bits = binary.charAt(length - 1 - i);
			if (bits == '1') {
				decimal += Math.pow(2, i);
			}

		}
		return decimal;

	}

	public static void main(String[] args) {
		System.out.println("main metrthod started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary digits");
		String binaryNum = sc.next();
		int decimal = converToDecimal(binaryNum);
		System.out.println("Decimal Number:  " + decimal);
		sc.close();
	}

}
