package com.array;

public class Array2D {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("2D array representation");
		for (int[] arr1 : arr) {
			for (int n : arr1) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

	}

}
