package com.array;

public class MergeofTwoArrays {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3 };
		int b[] = { 4, 5, 6 };
		int c[] = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int j = 0; j < b.length; j++) {
			c[j + a.length] = b[j];
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}

}
