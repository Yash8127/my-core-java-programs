package com.stringhandling;

public class TestDeom1 {

	public static void main(String[] args) {
		String a = "hello";
		String b = "world";
		String d = "helloworld";
		String c = a + b;
		c = c.intern();
		if (c == d) {
			System.out.println("true");
		}
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		String x = "ja"; // SCP
		String y = "va"; // SCP
		String z = x + "va";
		System.out.println(x == z); // true
		System.out.println("**********************");
		String A ="Hello";
		String B="Java";
		System.out.println(A.compareTo(B));
		

	}

}
