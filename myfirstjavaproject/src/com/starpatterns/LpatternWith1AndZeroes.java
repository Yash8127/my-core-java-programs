package com.starpatterns;

public class LpatternWith1AndZeroes {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			int num = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(num);
				if (num == 1) {
					num = num-1;
				} else {
					num = 1;
				}
			}
			System.out.println();
		}
	}

}
