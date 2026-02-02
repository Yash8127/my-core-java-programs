package com.opeartors;

// ++ , --,
public class UnaryOP {

	public static void main(String[] args) {
		int a = 4;
		System.out.println(a++);// 4
		System.out.println(a);// 5
		System.out.println(a++ + ++a - a++);// 5+7-7=5
		System.out.println(a);// 8
		System.out.println(a-- - ++a + a++ - a);// 8-8+8-9=-1
		System.out.println(a);// 9
	}

}
