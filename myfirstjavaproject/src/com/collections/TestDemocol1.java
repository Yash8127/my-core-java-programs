package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestDemocol1 {

	public static void main(String[] args) {
		System.out.println("Main method started");

		Collection<Integer> sal = new ArrayList<>();
		sal.add(15000);
		sal.add(18000);
		sal.add(19000);
		sal.add(16000);
		sal.add(21000);
		sal.add(34000);
		int max = 0;
		for (Integer s : sal) {
			if (s > max) {
				max = s;
			}

		}
		System.out.println("maximum salary: " + max);
		System.out.println("******************************");
		Iterator<Integer> it = sal.iterator();
		int max1 = 0;
		while (it.hasNext()) {
			Integer currentSal = it.next();
			if (currentSal > max1) {
				max1 = currentSal;

			}
		}
		System.out.println(max1);
	}

}
