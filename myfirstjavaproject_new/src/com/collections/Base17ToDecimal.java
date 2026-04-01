package com.collections;

import java.util.*;

public class Base17ToDecimal {

	public static void main(String[] args) {
//		double a = 'a';
//		System.out.println(a);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Base17 Number (max 4 digits): ");
		String input = sc.next().toUpperCase();

		HashMap<Character, Integer> map = new HashMap<>();

		// Insert mappings
		map.put('A', 10);
		map.put('B', 11);
		map.put('C', 12);
		map.put('D', 13);
		map.put('E', 14);
		map.put('F', 15);
		map.put('G', 16);

		int decimal = 0;
		int power = 0;

		for (int i = input.length() - 1; i >= 0; i--) {
			char ch = input.charAt(i);
			int value;
			if (Character.isDigit(ch))
				value = ch - '0';
			else
				value = map.get(ch);

			decimal += value * Math.pow(17, power);
			power++;
		}

		System.out.println("Decimal Value = " + decimal);
	}
}