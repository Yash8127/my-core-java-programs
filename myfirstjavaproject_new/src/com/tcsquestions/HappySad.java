package com.tcsquestions;

import java.util.Scanner;

import java.util.*;

public class HappySad {
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		// read full line
		String input = sc.nextLine();
		String[] parts = input.split(" ");
		int H = Integer.parseInt(parts[0]);
		int S = 0;// default value

		if (parts.length > 1) {
			S = Integer.parseInt(parts[1]);
		}
		int newHappy = (int) (0.7 * H + 0.5 * S);
		int newSad = (int) (0.3 * H + 0.5 * S);

		System.out.println(newHappy + " " + newSad);
	}
}