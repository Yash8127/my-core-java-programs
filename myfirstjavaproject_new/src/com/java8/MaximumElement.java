package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaximumElement {

	public static void main(String[] args) {
		System.out.println("Main method started");

		List<Integer> num = Arrays.asList(1, 2, 3, 88, 99, 100, 133);
		Optional<Integer> max = num.stream().max(Integer::compareTo);
		Optional<Integer> min = num.stream().min(Integer::compareTo);
		System.out.println("Maximum : " + max.get() + " Minimum : " + min.get());
	}

}