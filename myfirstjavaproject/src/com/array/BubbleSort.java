package com.array;

import java.util.Scanner;

public class BubbleSort {

	static void getBubble(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}

			}
			if (!flag)
				break;
		}
		System.out.println();
		System.out.println("Ater Sorting");
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Elements for array as per size:" + size);
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Before Sorting");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		getBubble(arr);

		sc.close();
	}

}
