package com.interviewcoding;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

public class FindDuplicates {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 1);

		Set<Integer> uniqueElements = new HashSet<>();

		Set<Integer> duplicates = numbers.stream()
				.filter(n -> !uniqueElements.add(n))
				.collect(Collectors.toSet());

		System.out.println("Duplicates: " + duplicates);
	}
}