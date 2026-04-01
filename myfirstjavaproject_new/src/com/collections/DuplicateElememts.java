package com.collections;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElememts {

	public static void main(String[] args) {
		System.out.println("main method started");
		List<Integer> li = new ArrayList<>();
		li.add(3);
		li.add(1);
		li.add(3);
		li.add(2);
		li.add(3);
		li.add(1);
		li.add(1);
		li.add(3);
		for (int i = 0; i < li.size(); i++) {
			int count = 0;
			for (int j = i + 1; j < li.size(); j++) {
				if (li.get(i).equals(li.get(j))) {
					count++;
				}

			}
			if (count == 1) {
				System.out.print(li.get(i) + " ");
			}
		}
	}

}
