package com.logicalstatements.loops;

public class SumAndCount {

	public static void main(String[] args) {
		int count = 0;
		int sum =0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				count++;
			}
			else
			sum = sum +i;
		}
		System.out.println("Even numbers count: "+count);
		System.out.println("odd numbers sum: "+sum);
	}
	

}
