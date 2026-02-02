package com.whileloop;
/*✅ Definition

A number n is a Strong Number if:
sum of factorial(digits of n) = n

✅ Example: 145
Digits → 1, 4, 5
1! = 1
4! = 24
5! = 120
Sum → 1 + 24 + 120 = 145
✔ So 145 is a Strong Number*/

import java.util.Scanner;

public class StrongNum {
	static long findFact(long n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * findFact(n - 1);

	}

	static boolean isStrongNum(int a) {
		int r = 0;
		int sum = 0;
		int temp = a;
		while (a != 0) {
			r = a % 10;
			a = a / 10;
			sum += findFact(r);

		}
		if (sum == temp)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if (isStrongNum(n))
			System.out.println("Given number is a Strong Number");
		else
			System.out.println("Not a Strong Number");
		sc.close();
	}

}
