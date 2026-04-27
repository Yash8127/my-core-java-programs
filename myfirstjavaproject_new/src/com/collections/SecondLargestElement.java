package com.collections;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class SecondLargestElement {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 50, 20, 30, 40, 50);
		TreeSet<Integer> set = new TreeSet<Integer>(list);

		int secondLargest = set.lower(set.last());
		System.out.println(secondLargest);

	}
}
