package com.array;

public class FirstSecondMaxNum {

	public static void main(String[] args) {
		System.out.println("Main method started");
		int[] num = { 7, 5, 6 };
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		if (num.length < 2) {
			System.out.println("-1");
			return;
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max1) {
				max2 = max1;
				max1 = num[i];
			} else if (num[i] > max2 && num[i] != max1) {
				max2 = num[i];

			}

		}

		if (max2 == Integer.MIN_VALUE)
			System.out.println("-1");
		else {

			System.out.println("First Largest Number is: " + max1);
			System.out.println("Second Largest Number is: " + max2);
		}
	}

}
