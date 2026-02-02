package com.array;

import java.util.Scanner;

public class TestDemoArr1 {

	public static void main(String[] args) {
		System.out.println("Main method Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your array size");
		int size = sc.nextInt();
		int arr2[] = new int[size];
		System.out.println();
		System.out.println("Enter elements for array");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}

		System.out.print("reverse of array:");
		for (int i = arr2.length - 1; i >= 0; i--) {
			System.out.print(arr2[i] + ",");
		}

//		int arr1[] = new int[5];
//		arr1[0] = 22;
//		arr1[2] = 33;
//		arr1[4] = 44;
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.print(arr1[i] + " ");
//		}
//		int[] arr = { 10, 20, 30, 40, 50 };
//		System.out.println(arr[5]);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

		sc.close();
	}

}
