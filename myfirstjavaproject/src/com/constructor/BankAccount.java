package com.constructor;

public class BankAccount {
	String holderName;
	long accountNumber;
	double balance;
	{
		System.out.println("jsa");
	}

	BankAccount(String holderName) {
		this.holderName = holderName;
	}

	BankAccount(String holderName, long accountNumber) {
		this(holderName);
		this.accountNumber = accountNumber;
	}

	BankAccount(String holderName, long accountNumber, double balance) {
		this(holderName, accountNumber);
		this.balance = balance;
	}

	void display() {
		System.out.println("HOLDER NAME: " + holderName);
		System.out.println("ACCOUNT NUMBER: " + accountNumber);
		System.out.println("BALANCE: " + balance);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		BankAccount c1 = new BankAccount("Yaswanth",79810107878l, 10000);
		c1.display();
	}

}
