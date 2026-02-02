package com.expectionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayBOEAndInputMismatch {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		int arr[] = { 1, 4, 65, 7 };
		try {
			System.out.println("Enter a index number you want to access:");
			int n = sc.nextInt();
			System.out.println(arr[n]);
		} catch (ArrayIndexOutOfBoundsException | InputMismatchException a) {
			System.out.println("in catch of ABOE");
			System.err.println(a.getMessage());
			System.out.println(a.toString());
//			a.printStackTrace();
		}

		finally {
			sc.close();
		}

	}
}
