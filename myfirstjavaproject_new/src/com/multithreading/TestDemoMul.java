package com.multithreading;

public class TestDemoMul {

	void show() {
		System.out.println("show method started");
		System.out.println("main thread info: " + Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("show : " + i);
		}

		System.out.println("show method ended");
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println("main thread info: " + Thread.currentThread());
		TestDemoMul ct = new TestDemoMul();
		ct.show();
		for (int i = 0; i <= 10; i++) {
			System.out.println("main: " + i);
		}
		System.out.println("main method ended");
	}

}
