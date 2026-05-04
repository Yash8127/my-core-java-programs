package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDemo1 {
	public static void main(String[] args) {
		System.out.println("main method started");
		List<Integer> num = Arrays.asList(11, 22, 3, 4, 5, 9, 55, 42, 36);
		Stream<Integer> s = num.stream();
		Stream<Integer> even = s.filter(i -> i % 2 == 0).sorted();
		List<Integer> result = even.collect(Collectors.toList());
		System.out.println(num);
		System.out.println(result);
	}
}
