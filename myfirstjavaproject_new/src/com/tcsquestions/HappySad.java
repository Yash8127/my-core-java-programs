package com.tcsquestions;

import java.util.Scanner;

public class HappySad {
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);

		// Read input
		int H = sc.nextInt();

		// Check if second input exists (S)
		if (sc.hasNextInt()) {
			int S = sc.nextInt();

			int newHappy = (int) (0.7 * H + 0.5 * S);
			int newSad = (int) (0.3 * H + 0.5 * S);

			System.out.println(newHappy + " " + newSad);
		} else {
			// Case: only H given (all happy)
			int newHappy = (int) (0.7 * H);
			int newSad = (int) (0.3 * H);

			System.out.println(newHappy + " " + newSad);
		}

		sc.close();
	}
}