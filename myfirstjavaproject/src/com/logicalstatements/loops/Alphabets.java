package com.logicalstatements.loops;

public class Alphabets {

	public static void main(String[] args) {
		int i = 1;
		System.out.println("Upper case letters");

		for (char a = 65; a <= 90; a++) {
			System.out.print(a + " " + i++ + ",");
		}
		System.out.println();
		System.out.println("lower case letters:");
		i = 1;
		for (char c = 97; c <= 122; c++) {
			System.out.print(c + " " + i++ + ",");
		}

	}
}
