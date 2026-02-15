package com.array;

public class SubArray {

	public static void main(String[] args) {
		System.out.println("Main method Started");
		int[] arr = { 1, 2, 3, 4 };
		int n = arr.length;

		// picking starting index
		for (int start = 0; start < n; start++) {
			// picking ending index
			for (int end = start; end < n; end++) {
				// printing sub array
				for (int i = start; i <= end; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
			}
		}

	}

}
