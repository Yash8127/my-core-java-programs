package com.interviewcoding;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 20, 40, 50, 40);

		Set<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);

		System.out.println(uniqueNumbers);
	}
}