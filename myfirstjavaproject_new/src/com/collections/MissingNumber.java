package com.collections;

import java.util.*;

public class MissingNumber {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 9, 100 };

		Set<Integer> set = new HashSet<>();
		int max = Integer.MIN_VALUE;
		for (int num : arr) {
			set.add(num);
			if (num > max) {
				max = num;
			}
		}

		for (int i = 1; i <= max; i++) {
			if (!set.contains(i)) {
				System.out.print(i + " ");
			}
		}
	}
}