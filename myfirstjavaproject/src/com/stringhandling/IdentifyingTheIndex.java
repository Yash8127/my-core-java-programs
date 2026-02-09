package com.stringhandling;

public class IdentifyingTheIndex {

	public static void main(String[] args) {
		System.out.println("main method started");
		String s = "Hello my name is G yaswanth";
		int index = -1;
		for (int i = 0; i < 3; i++) {

			index = s.indexOf('a', index + 1);
			if (index == -1) {
				System.out.println("Less than three charcaters");
				return;
			}

		}
		System.out.println("index of 3rd occurance of a: " + index);

	}

}
