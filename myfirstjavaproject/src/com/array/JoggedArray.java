package com.array;

public class JoggedArray {

	public static void main(String[] args) {
		System.out.println("Main method Started");

		int[][] array = new int[3][];
		array[0] = new int[3];
		array[1] = new int[4];
		array[2] = new int[5];
		for (int arr[] : array) {
			for (int a : arr) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

}
