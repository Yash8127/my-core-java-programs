package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseAList {
	public static void main(String[] args) {
		System.out.println("Main method started");
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		int start = 0;
		int end = list.size() - 1;
		while (start < end) {
			int temp = list.get(end);
			list.set(end, list.get(start));
			list.set(start, temp);

			start++;
			end--;

		}
		System.out.println("Reversed List: " + list);

	}
}
