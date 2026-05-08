package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveOccurences {
	public static void main(String[] args) {
		System.out.println("Main method started");
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 6, 7, 8));
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			if (it.next() == 2) {
				it.remove();
			}
		}
		System.out.println(list);
	}

}
