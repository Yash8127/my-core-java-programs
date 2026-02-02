package com.starpatterns;

public class DiamondPattern {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = i; j < 3; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= 2 * 2-i; k++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
