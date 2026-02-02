package com.array;
//input:123,143,157,193,117
//output:1236 1438 15713 19313 1179 
//expalination:1+2+3=6
// 6 appends  to 123 --->1236

public class TestDemo5 {
	static void addDigitsAndAppenditAtLast(int[] num) {
		for (int i = 0; i < num.length; i++) {
			int n = num[i];
			int r = 0;
			int sum = 0;
			int newnum = 0;
			while (n != 0) {
				r = n % 10;
				sum += r;
				n /= 10;
			}
			if (sum <= 9)
				newnum = num[i] * 10 + sum;
			else
				newnum = num[i] * 100 + sum;

			System.out.print(newnum + " ");
		}

	}

	public static void main(String[] args) {
		int[] num = { 123, 143, 157,193,117};
		addDigitsAndAppenditAtLast(num);
	}

}
