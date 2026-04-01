package com.whileloop;

//Replace 0 with 1 in a Number
import java.util.Scanner;

public class ReplaceZero {

	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = 0;
		int place = 1;
		while (num > 0) {
			int digit = num % 10;
			if (digit == 0) {
				digit = 1;
			}
			result = result + digit * place;
			place *= 10;
			num /= 10;
		}
		System.out.println("After Replaceing With Zeroes: " + result);
	}

}
