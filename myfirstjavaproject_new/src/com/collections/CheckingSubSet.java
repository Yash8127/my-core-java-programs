package com.collections;

import java.util.HashSet;
import java.util.Set;

public class CheckingSubSet {

	public static void main(String[] args) {
		System.out.println("Main method started");
		int[] num1 = { 2, 3, 4, 1 };
		int[] num2 = { 2, 1, 4 ,3};
		boolean isSubSet = true;
		Set<Integer> s1 = new HashSet<>();
		Set<Integer> s2 = new HashSet<>();
		for (int n : num1) {
			s1.add(n);
		}
		for (int n : num2) {
			s2.add(n);
		}

		for (Integer n1 : s2) {
			if (!s1.contains(n1)) {
				isSubSet = false;
				break;
			}

		}
		if (isSubSet) {
			System.out.println("s2 is the subset of s1");
		} else {
			System.out.println("s2 is not the subset of s1");
		}

	}

}
