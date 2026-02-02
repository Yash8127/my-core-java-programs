package com.logicalstatements.loops;

public class RangePerfectNum {

	static void isPerfect(int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0)
				sum += i;
		}
		if (num == sum)
			System.out.print(num + ",");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("perfect numbers between 1 and 1000");
		for (int num = 1; num <= 1000; num++) {
			isPerfect(num);
		}
	}

}
