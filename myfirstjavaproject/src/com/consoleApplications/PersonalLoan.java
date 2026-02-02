package com.consoleApplications;

class PersonalLoan extends Loan {

    @Override
    void calculateInterest() {
        interestRate = 12.0;
        double interest = (principal * interestRate * tenure) / 100;

        System.out.println("\n--- Personal Loan Details ---");
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Total Interest: ₹" + interest);
        System.out.println("Total Amount Payable: ₹" + (principal + interest));
    }
}