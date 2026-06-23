package com.interviewcoding;

import java.util.Arrays;
import java.util.List;

public class SecondLargestElement {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

		Integer secondLargest = numbers.stream()
				.distinct()
				.sorted((a, b) -> b - a)
				.skip(1)
				.findFirst()
				.get();

		System.out.println("Second Largest Element: " + secondLargest);
	}
}