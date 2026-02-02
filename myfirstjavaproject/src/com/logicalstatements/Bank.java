package com.logicalstatements;

import java.util.Scanner;

public class Bank {
	static int intialBalance = 5000;
	static {
		System.out.println("WELCOME TO A SIMPLE BANK MENU SYSTEM");
	}

	static void checkbalance() {
		System.out.println("Current Balance: " + intialBalance);
	}

	static void depositmoney(int money) {
		int balance = 0;
		balance = money + intialBalance;
		System.out.println("Current Balance After deposit: " + balance);
	}

	static void withdrawmoney(int withdrawAmount) {
		int balance = 0;
		balance = intialBalance - withdrawAmount;
		System.out.println("Current Balance after Withdraw: " + balance);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu = "1.Check balance\n" + "2.Deposit Money\n" + "3.Withdraw Money\n" + "4.Exit\n";
		System.out.println(menu);
		System.out.println("Enter your choice as per Your requirement");
		int choice = sc.nextInt();
		switch (choice) {
		case 1 -> checkbalance();
		case 2 -> {
			System.out.println("Enter your deposit Amount");
			int depositMoney = sc.nextInt();
			if (depositMoney > 500 && depositMoney <= 50000)
				depositmoney(depositMoney);
			else
				System.out.println("Your deposit money should be between 500 and 500000");
		}
		case 3 -> {
			System.out.println("Enter your withdraw money");
			int withdrawAmount = sc.nextInt();
			if (withdrawAmount < intialBalance && withdrawAmount > 0)
				withdrawmoney(withdrawAmount);
			else
				System.out.println("INSUFFICIENT BALANCE\nyour withdraw amount is not valid\nplease enter valid amount");
		}
		case 4 -> System.out.println("THANK YOU FOR USING OUR APPLICATION");
		default -> System.out.println("INVALID CHOICE");

		}
		sc.close();
	}

}
