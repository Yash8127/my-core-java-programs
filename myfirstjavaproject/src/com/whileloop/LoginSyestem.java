package com.whileloop;

import java.util.Scanner;

public class LoginSyestem {

	public static void main(String[] args) {
		System.out.println("main method started");
		String password = "java123";
		int n = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("*******************************************");
		System.out.println("Enter your password");

		do {
			String pass = sc.next();
			if (pass.equals(password)) {
				System.out.println("Access Granted");
				break;
			}
			if (n <= 2 && !pass.equals(password))
				System.out.println("password mismatched\n" + "please Re entry your password");
			if (n == 3)
				System.out.println("Account Locked");

			n++;
		} while (n <= 3);
		System.out.println("*****************************************************");
		System.out.println("main method ended");
		sc.close();
	}

}
