package com.starpatterns;

public class Pattern1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("**************************");
		int n = 6;
		char ch = 'A';
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (j <= i) {
					System.out.print(j + " ");
				} else {
					System.out.print(ch + " ");
				}

			}
			ch++;
			System.out.println();
		}
	}

}
