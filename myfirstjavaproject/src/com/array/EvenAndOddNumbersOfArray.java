package com.array;

public class EvenAndOddNumbersOfArray {

	public static void main(String[] args) {
		System.out.println("Main method started");
		int numbers[] = { 2, 56, 3, 11, 33, 44, 66 };
		System.out.print("Even Numbers:");
		for (int i = 0; i < numbers.length; i++) {
			int n = numbers[i];
			if (n % 2 == 0)
				System.out.print(n + " ");
		}
		System.out.println();
		System.out.print("Odd numbers:");
		for (int i = 0; i < numbers.length; i++) {
			int n = numbers[i];
			if (n % 2 == 1)
				System.out.print(n + " ");
		}
	}

}
