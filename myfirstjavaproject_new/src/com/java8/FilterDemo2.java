package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
	public static void main(String[] args) {
		System.out.println("Main method started");
		List<String> names = Arrays.asList("yaswanth", "poojitha", "uma", "sai", "vamsi", "Hruthik");
		List<String> result = names.stream()
				             .filter(name -> name.toLowerCase().contains("a"))
				             .collect(Collectors.toList());
		System.out.println(result.toString());
	}
}
