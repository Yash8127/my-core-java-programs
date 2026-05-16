package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesUsingLamba {
	public static void main(String[] args) {
		System.out.println("main method started");
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 1, 1, 2, 3, 5);
		List<Integer> distnictElements = num.stream().distinct().collect(Collectors.toList());
		System.out.println(distnictElements);
	}
}
