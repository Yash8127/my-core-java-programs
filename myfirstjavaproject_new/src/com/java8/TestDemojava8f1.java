package com.java8;

@FunctionalInterface
interface Cal {
	void add(int a, int b);
}

public class TestDemojava8f1 {

	public static void main(String[] args) {
//		Cal c = (a, b) -> {
//			return a * b;
//
//		};
		Cal c = (a, b) -> System.out.println("Addition of Two Numbers is: " + (a + b));
		c.add(20, 40);
	}

}
