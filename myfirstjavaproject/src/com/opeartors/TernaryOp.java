package com.opeartors;

public class TernaryOp {

	public static void main(String[] args) {
		int a = 14;
		int b = 33;
		int biggerNum = (a > b) ? a : b;
		System.out.println(biggerNum);
		System.out.println("***********************");
		int x = 44;
		int y = 443;
		int z = 3567;
		int bigger = (x > y) ? (x > z ? x : y) : (y > z ? y : z);
		System.out.println(bigger);
		System.out.println("**************************");
	}
}