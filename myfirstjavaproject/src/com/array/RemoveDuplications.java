package com.array;

import java.util.Scanner;

public class RemoveDuplications {

	public static void main(String[] args) {
		System.out.println("Main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size for array: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter elements as per Size: " + size);
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
				}

			}
			if (count ==0) {
				System.out.print(array[i] + " ");
			}
		}
		sc.close();
	}

}
