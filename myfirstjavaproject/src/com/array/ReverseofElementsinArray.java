package com.array;

public class ReverseofElementsinArray {

	static int rev(int n) {
		int r = 0;
		int rev = 0;
		while (n != 0) {
			r = n % 10;
			n /= 10;
			rev = rev * 10 + r;
		}
		return rev;

	}

	public static void main(String[] args) {
		int numbers[] = { 211, 254, 111 };

		for (int i = 0; i < numbers.length; i++) {
			int elements = ReverseofElementsinArray.rev(numbers[i]);
			System.out.print(elements + " ");
		}
	}

}
