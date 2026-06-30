package com.interviewcoding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOccurrences {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 1, 4, 2);

		Map<Integer, Integer> map = new HashMap<>();

		for (Integer num : numbers) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		System.out.println(map);
	}
}