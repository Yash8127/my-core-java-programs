package com.DailyTask;

import java.util.Scanner;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {

		System.out.println("main method Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Word :");// swiss
		String s = sc.next();
		char[] ch = new char[s.length()];// {s,w,i,s,s}

		for (int i = 0; i < s.length(); i++) {

			ch[i] = s.charAt(i);

		}

		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}

			}

			if (count == 1) {
				System.out.print(ch[i] + " ");
				break;
			}
		}

	}
}
