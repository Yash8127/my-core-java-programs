package com.array;

import java.util.Scanner;

public class RotatingRightElements {

	static void rotateArray(int[] arr) {
		int n = arr.length;// 4->0,1,2,3
		int last = arr[n - 1];// Storing last element into one variable
		for (int i = n - 1; i > 0; i--) {
			arr[i] = arr[i - 1];// moving one index right side
		}
		arr[0] = last;
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Size");
		int s = sc.nextInt();
		int arr[] = new int[s];
		System.out.println("Enter a value ,how many positions to rotate right");
		int r = sc.nextInt();
		r %= s;// Avoid extra rotation
		System.out.println("Enter Elements for a array");
		for (int i = 0; i < s; i++) {
			arr[i] = sc.nextInt();
		}
		for (int k = 1; k <= r; k++) {
			rotateArray(arr);
		}
		System.out.println("Array after right roatation by " + r + " times");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		sc.close();
	}

}
