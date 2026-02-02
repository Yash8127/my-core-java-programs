package com.logicalstatements.loops;
//2, 5, 11, 17, 23, 31, 41, 47, 59, 67, 73, 83, 97

public class PrimeRange {

	static boolean getPrimeRange(int n) {
		if (n == 0 || n == 1)
			return false;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i <= 100; i++) {
			if (getPrimeRange(i)) {
				count++;
				if(count%2==1)
				System.out.print(i + " ");
			}
		}
		

	}

}
