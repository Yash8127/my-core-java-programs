package com.collections;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesUsingSet {

	public static void main(String[] args) {

		String[] names = { "yaswanth", "varma", "vamsi", "sai", "varma", "sai" };
		Set<String> st = new HashSet<String>();
		System.out.print("Duplicate Names: ");
		for (String name : names) {
			if (!st.add(name)) {
				System.out.print(name + " ");

			}

		}

	}

}
