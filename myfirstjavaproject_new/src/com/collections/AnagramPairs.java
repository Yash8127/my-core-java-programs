package com.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramPairs {

	static int[] countAnagramGroups(int N, String[] strings, int Q, String[] queries) {

		Map<String, Integer> map = new HashMap<>();

		// Build map
		for (String s : strings) {
			char[] arr = s.toCharArray();
			Arrays.sort(arr);
			String key = new String(arr);

			map.put(key, map.getOrDefault(key, 0) + 1);
		}

		// Process queries
		int[] result = new int[Q];

		for (int i = 0; i < Q; i++) {
			char[] arr = queries[i].toCharArray();
			Arrays.sort(arr);
			String key = new String(arr);

			result[i] = map.getOrDefault(key, 0);
		}

		return result;
	}

	public static void main(String[] args) {

		// Hardcoded input
		int N = 5;
		String[] strings = { "act", "tac", "dog", "god", "cat" };

		int Q = 3;
		String[] queries = { "act", "dog", "tca" };

		int[] result = countAnagramGroups(N, strings, Q, queries);

		// Output
		System.out.println("Output:");
		for (int res : result) {
			System.out.println(res);
		}
	}
}