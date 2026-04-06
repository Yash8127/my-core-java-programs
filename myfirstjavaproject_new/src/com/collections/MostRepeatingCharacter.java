package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MostRepeatingCharacter {

	public static void mostReapeted(String s) {
		if (s == null || s.isEmpty()) {
			System.out.println("String is Empty");
			return;
		}
		Map<Character, Integer> map = new HashMap<>();
		// step 1: count frequency
		for (char ch : s.toCharArray()) {
			// skipping the spaces
			if (ch == ' ')
				continue;
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		// step 2: find maximum frequency
		int max = 0;
		for (int value : map.values()) {
			if (value > max) {
				max = value;
			}
		}
		// step 3: collect all characters with maxmimum frequency
		List<Character> result = new ArrayList<>();
		for (Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() == max) {
				result.add(entry.getKey());
			}

		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());

		}

		System.out.println("Most Repeating Character : " + result);
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String : ");
		String s = sc.nextLine();
		mostReapeted(s);
		System.out.println("Main method end");
	}

}
