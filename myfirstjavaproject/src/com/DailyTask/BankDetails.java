package com.DailyTask;

import java.util.Scanner;

public class BankDetails {
	String branam = "Doddavaram";
	String ifsc = "UBIN0807982";
	int fixedsavingamount(int depamo) {
		int sav = 1000;
		int total = sav + depamo;
		return total;
	}
	void showdetails(String name,long accnum,int depamo,int total) {
		System.out.println("Account Holder Name: "+name);
		System.out.println("Account Number: "+accnum);
		System.out.println("Branch: "+branam);
		System.out.println("IFSC: "+ifsc);
		System.out.println("Deposit Amount: "+depamo);
		System.out.println("Account Balance: "+total);
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		BankDetails a = new BankDetails();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Account Number: ");
		long accnum = sc.nextLong();
		System.out.println("Enter Account Holder Name: ");
		String accname = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter your Deposit Amount: ");
		int depamo = sc.nextInt();
		int total = a.fixedsavingamount(depamo);
		a.showdetails(accname, accnum, depamo, total);
		sc.close();
	}

}
