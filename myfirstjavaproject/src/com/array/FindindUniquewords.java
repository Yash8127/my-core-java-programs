package com.array;

import java.util.Arrays;

public class FindindUniquewords {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("************************");

		String[] s = { "tommy", "john", "tommy", "harry", "harry" };
		String[] distinct = new String[s.length];
		int index = 0;

		System.out.println("Duplicated Words: ");

		for (int i = 0; i < s.length; i++) {

			for (int j = i + 1; j < s.length; j++) {
				if (s[i].equals(s[j])) {
					System.out.print(s[i] + " ");
					distinct[index] = s[i];
					index++;

				}
			}

		}
		System.out.println();
		System.out.println("Unique words:");

		for (int i = 0; i < s.length; i++) {
			int count = 0;
			for (int j = 0; j < s.length; j++) {
				if (s[i].equals(s[j])) {
					count++;
				}

			}
			if (count == 1) {
				System.out.print(s[i] + " ");
				distinct[index] = s[i];
				index++;
			}
		}

		System.out.println();
		System.out.println("Distinct Elements: ");
		System.out.println(Arrays.toString(distinct));

	}

}
