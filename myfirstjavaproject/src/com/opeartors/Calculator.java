package com.opeartors;

public class Calculator {

	int addition(int a, int b) {
		int add = a + b;
		return add;
	}

	int sub(int a, int b) {
		int sub = b - a;
		return sub;
	}

	double mul(int a, int b) {
		double mul = a * b;
		return mul;
	}

	double div(int a, int b) {
		double div = a / b;
		return div;
	}

	public static void main(String[] args) {
		Calculator values = new Calculator();
		int add = values.addition(20, 30);
		int sub = values.sub(50, 33);
		double mul = values.mul(244, 23);
		double div = values.div(66, 21);
		System.out.println("Additoin: "+add);
		System.out.println("subtraction:"+sub);
		System.out.println("multiplication: "+mul);
		System.out.println("Division: "+div);
	}

}
