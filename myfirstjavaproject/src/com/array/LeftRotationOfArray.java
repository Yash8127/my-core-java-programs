package com.array;

import java.util.Scanner;

//⭐ Logic (Reverse Method → Best Method)

//To rotate left by k:

//Reverse first k elements

//Reverse remaining n-k elements

//Reverse whole array

//This method is very efficient — O(n).

public class LeftRotationOfArray {
	static void rotationArray(int[] arr, int k) {
		int start = 0;
		int end = arr.length - 1;
		k = k % arr.length;// Avoid extra rotations
//		step:1->Reverse first k elements
		reverseArray(arr, start, k - 1);
//      step:2->Reverse remaining n-k elements
		reverseArray(arr, k, end);
//		step:3->reverse whole array
		reverseArray(arr, start, end);
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
		System.out.println("Main metbhod started");
		System.out.println("************************************************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number,How many times you want to LEFT rotate");
		int r = sc.nextInt();
		int[] arr = { 1, 2, 3, 4, 5 };
		rotationArray(arr, r);

		System.out.println("Array after left rotation by " + r + " times");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("************************************************");
		System.out.println("Main method ended");

		sc.close();
	}

}
