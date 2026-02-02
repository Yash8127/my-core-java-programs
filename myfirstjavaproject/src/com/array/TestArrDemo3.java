package com.array;

public class TestArrDemo3 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		int names[] = { 'a', 65, 'A', '?' };
		System.out.println(names.length);
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		double[] num = { 10, 25.5, 30, 44.4 };
		double sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println();
		System.out.println(sum);
	}

}
