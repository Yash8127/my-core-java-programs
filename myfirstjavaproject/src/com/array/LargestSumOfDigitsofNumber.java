package com.array;

public class LargestSumOfDigitsofNumber {
	
	//method to find largest sum of digits in Number

	static int largestsum(int[] arr) {
		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int r = 0;
			int sum = 0;
			while (num > 9) {
				while (num != 0) {
					r = num % 10;
					sum += r;
					num /= 10;
				}
				num = sum;
			}
			if (sum > result) {
				result = sum;
			}
		}

		return result;

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] a = { 222,44,55,6666 };
		System.out.println(largestsum(a));
	}

}
