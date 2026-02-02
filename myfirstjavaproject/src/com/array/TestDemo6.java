package com.array;

import java.util.Arrays;

public class TestDemo6 {

	public static void main(String[] args) {
		int arr[] = { 17,16,15,19,1,1,2,3,4,5,6 };
		int n = arr.length / 2;
		// System.out.println(n/2);
//		int min = arr[0];
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = n + 1; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
