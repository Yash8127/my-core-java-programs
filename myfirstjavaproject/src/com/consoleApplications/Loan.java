package com.consoleApplications;

import java.util.Scanner;

/*
 * Parent Class : Loan
 * Contains common properties and methods for all loan types
 */
abstract class Loan {

    double principal;
    double interestRate;
    int tenure; // in years

    Scanner sc = new Scanner(System.in);

    // Method to accept common loan details
    void getLoanDetails() {
        System.out.print("Enter Loan Amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter Loan Tenure (in years): ");
        tenure = sc.nextInt();
    }

    // Abstract method (must be overridden)
    abstract void calculateInterest();
}
