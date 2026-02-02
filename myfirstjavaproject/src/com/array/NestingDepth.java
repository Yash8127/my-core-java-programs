package com.array;

import java.util.Scanner;

public class NestingDepth {

	public static void main(String[] args) {
		System.out.println("main mehod started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String or Expression");
		String s = sc.nextLine();
		System.out.println("maximum depth is: " + maxdepth(s));
		sc.close();
	}

	public static int maxdepth(String s) {
		int count = 0;
		int max = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(') {
				count++;
				if (count > max) {
					max = count;
				}
			} else if (ch == ')') {
				count--;
			}
		}

		return max;
	}

}
