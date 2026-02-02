package com.array;
//⭐ Logic (Reverse Method – Best Approach)

//To rotate right by k:

//Reverse entire array

//Reverse first k elements

//Reverse remaining n-k elements

import java.util.Scanner;

public class RightRotationOfArray {
	
	
	static void rotationArray(int[] arr, int k) {
		// step:1-> Reverse entire array
		int start = 0;
		int end = arr.length - 1;
		k %= arr.length;// Avoid extra rotation
		reverseArray(arr, start, end);
		// step:2-> Reverse first k elements
		reverseArray(arr, start, k - 1);
		// step:3->Reverse remaining n-k elements
		reverseArray(arr, k, end);
	}

	static void reverseArray(int[] arr, int start, int end) {
		int temp = 0;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

	public static void main(String[] args) {
		System.out.println("Main method Started");
		System.out.println("************************************************");
		int[] arr = { 1, 2, 3, 4, 5 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value that How many times you want to right rotate ");
		int r = sc.nextInt();
		rotationArray(arr, r);
		System.out.println("Array after Right rotation by " + r + " times");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("************************************************");
		System.out.println("Main method ended");
		sc.close();
	}

}
