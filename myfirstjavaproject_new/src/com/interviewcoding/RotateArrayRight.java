package com.interviewcoding;

import java.util.Arrays;

public class RotateArrayRight {

	public static void reverse(int[] arr, int start, int end) {

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
	}

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7};
		int k = 3;

		int n = arr.length;
		k = k % n;

		// Reverse entire array
		reverse(arr, 0, n - 1);

		// Reverse first k elements
		reverse(arr, 0, k - 1);

		// Reverse remaining elements
		reverse(arr, k, n - 1);

		System.out.println(Arrays.toString(arr));
	}
}