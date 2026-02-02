package com.array;

public class MaxElement {

	public static void main(String[] args) {
		int num[] = { 128, 20, 120, 33, 45, 33, 88, 98 };
		int max = num[0];
		int min = num[0];
		for (int i = 1; i < num.length; i++) {
			if (max < num[i])
				max = num[i];
			else if (min > num[i])
				min = num[i];
		}
		System.out.println(max);
		System.out.println(min);
	}

}
