package com.array;

import java.util.Scanner;

public class MissingElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your array size");
		int size = sc.nextInt();
		int n[] = new int[size];
		System.out.println("Enter your Elements");
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}
		System.out.println("Missing Numbers");
		for (int i = 0; i < n.length - 1; i++) {
			int start = n[i];
			int end = n[i + 1];
			if (start == end)
				continue;
			for (int j = start + 1; j < end; j++) {
				System.out.print(j + " ");
			}
		}
//Anthoer approach but All Test not Cases Passed
//		int max = n[0];
//		int min = n[0];
//		int sum = 0;
//
//		for (int i = 0; i < n.length; i++) {
//			if (n[i] > max) {
//				max = n[i];
//			}
//		}
//		for (int i = 0; i < n.length; i++) {
//			if (n[i] < min)
//				min = n[i];
//		}
//		for (int i = 0; i < n.length; i++) {
//			sum += n[i];
//		}
//		int sum1 = 0;
//		for (int i = min; i <= max; i++) {
//			sum1 += i;
//		}
//		System.out.println("Missing Element: " + (sum1 - sum));

		sc.close();
	}

}
