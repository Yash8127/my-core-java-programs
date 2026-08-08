package com.interviewcoding;

public class Zigzag {

	static boolean isPrime(int number) {
		if (number < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		int n = 5;
		int number = 1;
		for (int i = 1; i <= n; i++) {
			int row[] = new int[i];
			int index = 0;
			while (index < i) {
				if (!isPrime(number)) {
					row[index] = number;
					index++;

				}
				number++;
			}
			// forward
			if (i % 2 == 1) {
				for (int j = 0; j < i; j++) {
					System.out.print(row[j] + " ");
				}
			} else {
				// reverse
				for (int j = i - 1; j >= 0; j--) {
					System.out.print(row[j] + " ");
				}
			}
			System.out.println();
		}

	}

}
