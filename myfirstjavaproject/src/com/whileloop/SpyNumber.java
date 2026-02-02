package com.whileloop;

/*A number n is a Spy Number if:
sum of digits = product of digits
Take 112:
Digits → 1, 1, 2
Sum = 1 + 1 + 2 = 4
Product = 1 × 1 × 2 = 2
❌ Not equal, so 112 is NOT a Spy Number.
*/
import java.util.Scanner;

public class SpyNumber {

	static boolean isSpy(int n) {
		boolean flag = false;
		int r = 0;
		int sum = 0;
		int pro = 1;
		while (n != 0) {
			r = n % 10;
			n /= 10;
			sum += r;
			pro *= r;
		}
		if (sum == pro)
			flag = true;
		return flag;
	}

	public static void main(String[] args) {
		int a = 10;
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter a number");
			int n = sc.nextInt();
			if (isSpy(n)) {
				System.out.println("The Given Number is spy number");
			} else
				System.out.println("The Given Number is not spy number");
		} while (a < 20);
		System.out.println("main method ended");

		sc.close();
	}

}
