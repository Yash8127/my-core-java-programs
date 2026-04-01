package com.tcsquestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter a numbers: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Set<Integer> unique = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();
		System.out.print("Duplicate elements: ");
		for (int i = 0; i < n; i++) {
			if (!unique.add(arr[i])) {
				duplicate.add(arr[i]);
			}
		}
		System.out.println("Duplicate Elements: " + duplicate);
		System.out.println("Unique Elements :" + unique);
		sc.close();
	}

}
