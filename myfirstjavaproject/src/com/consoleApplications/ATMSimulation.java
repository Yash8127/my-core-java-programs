package com.consoleApplications;

import java.util.Scanner;

/*
 * ATM Simulation System
 * Domain : Banking & Financial Services
 * Tools  : Core Java (Loops, Conditions, Methods)
 */

public class ATMSimulation {

    // Initial account balance
    static double balance = 10000.00;

    // Default ATM PIN
    static final int PIN = 1234;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("        WELCOME TO ATM            ");
        System.out.println("=================================");

        // PIN Authentication
        if (!validatePIN()) {
            System.out.println("❌ Incorrect PIN. Access Denied.");
            return;
        }

        int choice;

        // Menu-driven loop
        do {
            displayMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;

                case 2:
                    depositAmount();
                    break;

                case 3:
                    withdrawAmount();
                    break;

                case 4:
                    System.out.println("✅ Thank you for using ATM.");
                    break;

                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }

    // Displays ATM menu
    public static void displayMenu() {
        System.out.println("\n------ ATM MENU ------");
        System.out.println("1. Balance Enquiry");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    // PIN validation method
    public static boolean validatePIN() {
        System.out.print("Enter ATM PIN: ");
        int enteredPin = sc.nextInt();
        return enteredPin == PIN;
    }

    // Balance enquiry
    public static void checkBalance() {
        System.out.println("💰 Available Balance: ₹" + balance);
    }

    // Deposit method
    public static void depositAmount() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        // Validation
        if (amount <= 0) {
            System.out.println("❌ Invalid deposit amount.");
            return;
        }

        balance += amount;
        System.out.println("✅ Amount deposited successfully.");
        System.out.println("Updated Balance: ₹" + balance);
    }

    // Withdrawal method
    public static void withdrawAmount() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        // Validation
        if (amount <= 0) {
            System.out.println("❌ Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("❌ Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("✅ Please collect your cash.");
            System.out.println("Remaining Balance: ₹" + balance);
        }
    }
}
