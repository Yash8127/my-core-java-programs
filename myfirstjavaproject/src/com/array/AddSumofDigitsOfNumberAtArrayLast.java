package com.array;

//input:23,45
//output:23,45,5,9
public class AddSumofDigitsOfNumberAtArrayLast {

	static void sumOfdigits(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			int num = arr[i];
			int r = 0;
			int sum = 0;
			while (num != 0) {
				r = num % 10;
				sum += r;
				num /= 10;
			}
			System.out.print(sum + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 12,23,45,93,11,21,91 };
		for (int n : arr) {
			System.out.print(n + " ");
		}
		sumOfdigits(arr);
	}

}
