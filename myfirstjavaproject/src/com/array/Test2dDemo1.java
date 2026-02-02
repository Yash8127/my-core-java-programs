package com.array;

public class Test2dDemo1 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println("*************************************");
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("Original matrix");
		for (int[] arr1 : arr) {
			for (int a : arr1) {
				System.out.print(a + " ");

			}
			System.out.println();
		}
		System.out.println("*************************************");
		System.out.println("Reverse the even row elements");
		// Reverse the even position of elements of rows->0,2

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i % 2 == 0) {
					int start = 0;
					int end = arr.length - 1;
					int temp = 0;
					while (start < end) {
						temp = arr[i][start];
						arr[i][start] = arr[i][end];
						arr[i][end] = temp;
						start++;
						end--;
						System.out.print(arr[i][j] + "  ");
					}

				} else
					System.out.print(arr[i][j] * 2 + "  ");
			}

			System.out.println();
		}
	}

}
