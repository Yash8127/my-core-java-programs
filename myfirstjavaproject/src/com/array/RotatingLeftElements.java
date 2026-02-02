package com.array;

import java.util.Scanner;

public class RotatingLeftElements {
	static void rotateArray(int[] arr) {
		int n = arr.length;
		int first = arr[0];
		for (int i = 0; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[n - 1] = first;
	}

	public static void main(String[] args) {

		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Size");
		int s = sc.nextInt();
		int arr[] = new int[s];
		System.out.println("Enter a value ,how many positions to rotate Left");
		int r = sc.nextInt();
		System.out.println("Enter Elements for a array");
		for (int i = 0; i < s; i++) {
			arr[i] = sc.nextInt();
		}
		for (int k = 0; k < r; k++) {
			rotateArray(arr);
		}
		System.out.println("Array after Left roatation by " + r + " times");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		sc.close();
	}

}
