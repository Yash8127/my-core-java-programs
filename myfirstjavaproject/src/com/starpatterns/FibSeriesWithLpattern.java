package com.starpatterns;

public class FibSeriesWithLpattern {

	public static void main(String[] args) {
		long a = 0;
		long b = 1;
		long c;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(a + " ");
				c = a + b;
				a = b;
				b = c;

			}
			System.out.println();
		}
	}

}
