package com.array;

import java.util.Arrays;

public class TargetSum {

	public static void main(String[] args) {
		System.out.println("Main method started");
		int[] num = { 3, 4, 5, 2 };
		Arrays.sort(num);// 2,3,4,5
		int start = 0;
		int end = num.length - 1;
		int target = 6;
		while (start < end) {
			int sum = num[start] + num[end];
			if (sum == target) {
				System.out.println("Indexes are " + start + " and " + end);
				return;
			} else if (sum < target) {
				start++;
			} else {
				end--;
			}
		}

	}

}
