package com.opeartors;

//&& , || ,  !
public class LogicalOp {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		int c = 48;
		System.out.println(a == b && a == c);
		System.out.println(a <= 40 && a <= c);
		System.out.println(a == b || a == c);
		System.out.println(a <= 40 || a <= c);
		System.out.println(!(a == b || a == c));
		System.out.println(!(a<= 40 || a <= c));
	}

}