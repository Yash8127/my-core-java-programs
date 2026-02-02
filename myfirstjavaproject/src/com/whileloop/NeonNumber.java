package com.whileloop;

/*✔ Definition

A number n is a Neon Number if:
sum of digits (n²) = n

✔ Example

Take 9:
Square → 9² = 81
Sum of digits → 8 + 1 = 9
Since the result equals the original number (9), 9 is a Neon Number.*/
import java.util.Scanner;

public class NeonNumber {

	static boolean isNeon(int n) {
		boolean flag = false;
		int square = n * n;
		int r = 0;
		int sum = 0;
		while (square != 0) {
			r = square % 10;
			square /= 10;
			sum += r;
		}
		if (sum == n)
			return flag = true;
		else
			return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		if (isNeon(n)) {
			System.out.println("Neon");
		} else
			System.out.println("Not Neon");
		sc.close();
	}

}
