package com.array;

import java.util.Arrays;

public class RearrangementArray {

	public static void main(String[] args) {
		int arr[] = { -5, 2, -4, -3, 2, 8, 5, -1 };
		int newArr[] = new int[arr.length];
		int negindex = 1;
		int posindex = 0;

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if (num > 0 && posindex < arr.length) {
				newArr[posindex] = num;
				posindex = posindex + 2;
			} else {
				newArr[negindex] = num;
				negindex = negindex + 2;
			}
		}
		System.out.println(Arrays.toString(newArr));
	}

}
