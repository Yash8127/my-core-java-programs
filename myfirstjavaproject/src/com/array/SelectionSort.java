package com.array;

import java.util.Scanner;

public class SelectionSort {

	static void getSelection(int[] arr) {
//		int[] a = { 40, 50, 20 };
		int temp = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int min = i;// 0 2
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}

			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}

		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

	public static void main(String[] args) {
		System.out.println("Main method Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array size");
		int s = sc.nextInt();
		int[] arr = new int[s];
		System.out.println("Enter Elememts for a Array Size: " + s);
		for (int i = 0; i < s; i++) {
			arr[i] = sc.nextInt();
		}
		getSelection(arr);
		sc.close();
	}
}
