package com.java8;

import java.util.function.Predicate;

public class IdentfyingPrimeUsingPredicate {
	public static void main(String[] args) {
		System.out.println("Main method started");
		Predicate<Integer> isPrime = (n) -> {
			if (n == 0 || n == 1) {
				return false;
			}
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		};
		System.out.println(isPrime.test(29));
	}
}
