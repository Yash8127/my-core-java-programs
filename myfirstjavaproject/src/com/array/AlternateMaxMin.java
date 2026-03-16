package com.array;

import java.util.Arrays;

public class AlternateMaxMin {

	public static void main(String[] args) {
		System.out.println("Main methos started");
		int[] num = { 1, 3, -3, -1, 4, 5 ,6};
		int[] result = new int[num.length];
		int index = 0;
		int left = 0;
		int right = num.length - 1;
		Arrays.sort(num);
		while (left <= right) {
			if (left != right) {
				result[index++] = num[right--];
				result[index++] = num[left++];
			} else {
				result[index++] = num[right--];
			}
		}
		System.out.println(Arrays.toString(result));
	}

}
