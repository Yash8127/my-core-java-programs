package com.stringhandling;

import java.util.Scanner;

public class TestDemo2 {

	public static void main(String[] args) {
//		TestDemo2 s = new TestDemo2();
//		String s1 = new String("yaswanth");
//		System.out.println(s);
//		System.out.println(s1);
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		int line = 1;
		while (sc.hasNext()) {
			String text = sc.nextLine();
			System.out.println(line + " " + text);
			line++;
		}
	}

}
