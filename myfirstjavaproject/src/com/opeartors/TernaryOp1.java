package com.opeartors;

public class TernaryOp1 {

	public static void main(String[] args) {
		int a = 30;
		int b = 33;
		int c = 55;
		int d = 77;

		int max = (a > b) ? ((a > c) ? ((a > d) ? a : d) : ((c > d) ? c : d))
				: ((b > c) ? ((b > d) ? b : d) : ((c > d) ? c : d));

		System.out.println("Maximum number: " + max);
	}

}
