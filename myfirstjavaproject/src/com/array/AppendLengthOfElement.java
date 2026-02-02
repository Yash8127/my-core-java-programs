package com.array;

public class AppendLengthOfElement {

	static int findCount(int num) {
		int count = 0;
		while (num != 0) {
			count++;
			num /= 10;
		}

		return count;
	}

	public static void main(String[] args) {
		int arr[] = { 25, 2, 226, 1, 8, 46 };
		for (int num : arr) {
			System.out.print(num);
			System.out.print(findCount(num) + " ");

		}
		// anthoer aprroach
//		for (int i = 0; i < arr.length; i++) {
//			int length = String.valueOf(arr[i]).length();
//			int number = arr[i] * 10 + length;
//			System.out.print(number + " ");
//		}

	}

}
