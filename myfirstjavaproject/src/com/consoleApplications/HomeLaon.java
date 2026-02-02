package com.consoleApplications;

class HomeLoan extends Loan {

    @Override
    void calculateInterest() {
        interestRate = 8.5;
        double interest = (principal * interestRate * tenure) / 100;

        System.out.println("\n--- Home Loan Details ---");
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Total Interest: ₹" + interest);
        System.out.println("Total Amount Payable: ₹" + (principal + interest));
    }
}
