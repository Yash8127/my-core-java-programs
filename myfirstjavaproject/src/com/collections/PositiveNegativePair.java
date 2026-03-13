package com.collections;

import java.util.ArrayList;
import java.util.List;

public class PositiveNegativePair {

	public static void main(String[] args) {
		int[] arr = { -2, -3, 1, 4, -5, 6, 8 };

		List<Integer> pos = new ArrayList<>();
		List<Integer> neg = new ArrayList<>();

		for (int n : arr) {
			if (n < 0)
				neg.add(n);
			else
				pos.add(n);
		}

		for (int i = 0; i < Math.max(pos.size(), neg.size()); i++) {
			Integer p = i < pos.size() ? pos.get(i) : null;
			Integer n = i < neg.size() ? neg.get(i) : null;
			System.out.print("(" + p + "," + n + ") ");
		}
	}

}
