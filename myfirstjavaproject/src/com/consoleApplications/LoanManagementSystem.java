package com.consoleApplications;

import java.util.Scanner;



public class LoanManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Loan loan = null;

        System.out.println("=================================");
        System.out.println("      LOAN MANAGEMENT SYSTEM     ");
        System.out.println("=================================");

        System.out.println("1. Home Loan");
        System.out.println("2. Personal Loan");
        System.out.println("3. Education Loan");
        System.out.print("Select Loan Type: ");
        int choice = sc.nextInt();

        // Selecting loan type using inheritance
        switch (choice) {
            case 1:
                loan = new HomeLoan();
                break;
            case 2:
                loan = new PersonalLoan();
                break;
            case 3:
                loan = new EducationLoan();
                break;
            default:
                System.out.println("❌ Invalid choice");
                System.exit(0);
        }

        // Common method call
        loan.getLoanDetails();

        // Overridden method call (runtime polymorphism)
        loan.calculateInterest();

        sc.close();
    }
}

