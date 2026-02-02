package com.array;

import java.util.Scanner;
//input:3,10,7,9
//output:9,20,49,18

public class TestArrDemo2 {

	public static void main(String[] args) {
//		int num[] = { 3, 10, 7, 9 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int num[] = new int[size];
		System.out.println("enter elemnets for array");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();

		}
		for (int i = 0; i < num.length; i++) {
			if (i % 2 == 0) {
				int resArr = num[i] * num[i];
				System.out.print(resArr + " ");
			} else {
				int resArr = num[i] * 2;
				System.out.print(resArr + " ");
			}

		}
		sc.close();
	}

}
