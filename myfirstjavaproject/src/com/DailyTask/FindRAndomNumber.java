package com.DailyTask;

import java.util.Random;
import java.util.Scanner;

public class FindRAndomNumber {

	public static void main(String[] args) {
		Random rd = new Random();
		int randomNum = rd.nextInt(10);
		Scanner sc = new Scanner(System.in);
		int n = 1;
		int count = 3;
		System.out.println("Guess the Random number");
		while (n <= 3) {
			int rdNum = sc.nextInt();
			if (randomNum == rdNum) {
				System.out.println("Congrats,You Guess the Right One");
				break;
			}
			if (n == 3) {
				System.out.println("Bad luck no more attempts left");
				
			}

			if (n <= 2 && randomNum != rdNum) {
				System.out.println("Sorry,You Guessed wrong one " + --count + " Attempts left ,Try again");
				n++;
			}
		}
		sc.close();
	}

}
