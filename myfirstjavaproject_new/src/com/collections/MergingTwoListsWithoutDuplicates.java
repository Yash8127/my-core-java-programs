package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MergingTwoListsWithoutDuplicates {

	public static void main(String[] args) {
		System.out.println("Main method started");

		List<Integer> list1 = Arrays.asList(1, 2, 3, 3, 5);
		List<Integer> list2 = Arrays.asList(3, 4, 5, 3, 5);

		List<Integer> union = new ArrayList<>();
		List<Integer> intersection = new ArrayList<>();

		for (Integer num : list1) {
			if (!union.contains(num))
				union.add(num);
			if (list2.contains(num) && !intersection.contains(num)) {
				intersection.add(num);
			}
		}
		for (Integer num : list2) {
			if (!union.contains(num)) {
				union.add(num);
			}

		}
//		System.out.println(result);
		Iterator<Integer> it = union.iterator();
		System.out.print("Union of Two Lists: ");
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

		ListIterator<Integer> lit = intersection.listIterator();
		System.out.println();
		System.out.print("Intersection of Two Lists: ");
		while (lit.hasNext()) {
			System.out.print(lit.next() + " ");
		}

	}

}
