package com.opeartors;

public class FindEvenOrOdd {

	public static void main(String[] args) {
		int a = 6;
		// using division
		String result = ((a / 2) * 2 == a) ? "Even" : "odd";
		System.out.println(result);
		System.out.println("************************");
        //using bits operator &
		String s1 = ((a & 1) == 0) ? "Even" : "odd";
		System.out.println(s1);
		System.out.println("***********************");
		//using % operator
		String s2 =(a%2==0)?"Even":"Odd";
		System.out.println(s2);

	}
}
