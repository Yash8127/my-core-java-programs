package com.expectionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExDemo1 {
	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a String :");
		String s = sc.nextLine();
		System.out.println("Enter a index value to search the char :");
		while (true) {
			try {
				int i = sc.nextInt();
				System.out.println(s.charAt(i));
				break;
			} catch (InputMismatchException in) {
//				sc.next();
				System.err.println("enter a number only");
				sc.next();
				// StringIndexOutOfBoundsException
			} catch (StringIndexOutOfBoundsException si) {
				System.err.println("index value must be between 0 and " + (s.length() - 1));
				System.err.println("Retry Enter a index value to search the char");
			}

		}
		System.out.println("main method ended !");
		sc.close();
	}
}
