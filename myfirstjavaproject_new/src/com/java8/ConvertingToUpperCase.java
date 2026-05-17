package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertingToUpperCase {
	public static void main(String[] args) {
		System.out.println("main method started");
		List<String> names = Arrays.asList("sai", "vamsi", "yaswanth", "pooji", "uma");
		List<String> names1 = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(names1);
	}
}
