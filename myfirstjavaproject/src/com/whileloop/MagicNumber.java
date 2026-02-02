package com.whileloop;
/*A magic number is a number in which the sum of its digits is repeatedly added until a single digit is obtained, 
and that final single digit is 1.
👉 If the final single digit = 1, then it is a Magic Number.
👉 Else, it is not a magic number.
✅ Example 1: 1729

Digits → 1 + 7 + 2 + 9 = 19
1 + 9 = 10
1 + 0 = 1

✔ Final result = 1
So 1729 is a Magic Number*/

import java.util.Scanner;

public class MagicNumber {

	static boolean isMagic(int n) {
		int r = 0;
		while (n > 9) {
			int sum = 0;
			while (n != 0) {

				r = n % 10;
				n = n / 10;
				sum += r;

			}
			n = sum;
		}
		if (n == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		if (isMagic(n)) {
			System.out.println("is magic");
		} else {
			System.out.println("normal");
		}
		sc.close();
	}

}
