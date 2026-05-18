package com.java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
		System.out.println("main method started");
		String s = "yaswanth";
		Map<Character, Long> fre = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(fre);

	}

}
