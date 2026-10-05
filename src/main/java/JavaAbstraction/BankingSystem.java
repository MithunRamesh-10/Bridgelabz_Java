package javaAbstraction;

/**
 * Problem 4: Banking System
 *
 * Demonstrates abstraction, encapsulation, interfaces
 * and polymorphism in a banking system.
 *
 * Author : Mithun
 * Date : 03-10-2026
 */
public class BankingSystem {

    // Interface for loan-related behavior
    interface Loanable {
        void applyForLoan();

        boolean calculateLoanEligibility();
    }

    // Abstract BankAccount class
    static abstract class BankAccount {
        private String accountNumber;
        private String holderName;
        private double balance;

        BankAccount(String accountNumber, String holderName,
                    double balance) {
            this.accountNumber = accountNumber;
            this.holderName = holderName;
            this.balance = balance;
        }

        // Getter methods
        public String getAccountNumber() {
            return accountNumber;
        }

        public String getHolderName() {
            return holderName;
        }

        public double getBalance() {
            return balance;
        }

        // Deposit money
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println(
                        "Deposited: ₹" + amount
                );
            }
        }

        // Withdraw money
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println(
                        "Withdrawn: ₹" + amount
                );
            } else {
                System.out.println("Insufficient balance");
            }
        }

        // Abstract interest calculation
        public abstract double calculateInterest();

        public void displayDetails() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Holder Name: " + holderName);
            System.out.println("Balance: ₹" + balance);
            System.out.println(
                    "Interest: ₹" + calculateInterest()
            );
        }
    }

    // Savings Account
    static class SavingsAccount extends BankAccount
            implements Loanable {

        SavingsAccount(String accountNumber, String holderName,
                       double balance) {
            super(accountNumber, holderName, balance);
        }

        @Override
        public double calculateInterest() {
            return getBalance() * 0.05;
        }

        @Override
        public void applyForLoan() {
            System.out.println(
                    getHolderName() + " applied for a loan."
            );
        }

        @Override
        public boolean calculateLoanEligibility() {
            return getBalance() >= 50000;
        }
    }

    // Current Account
    static class CurrentAccount extends BankAccount
            implements Loanable {

        CurrentAccount(String accountNumber, String holderName,
                       double balance) {
            super(accountNumber, holderName, balance);
        }

        @Override
        public double calculateInterest() {
            return getBalance() * 0.03;
        }

        @Override
        public void applyForLoan() {
            System.out.println(
                    getHolderName() + " applied for a loan."
            );
        }

        @Override
        public boolean calculateLoanEligibility() {
            return getBalance() >= 100000;
        }
    }

    public static void main(String[] args) {

        // Create different account types using BankAccount references
        BankAccount savings =
                new SavingsAccount(
                        "SB101", "Hemang", 60000
                );

        BankAccount current =
                new CurrentAccount(
                        "CA101", "Rahul", 120000
                );

        // Deposit and withdraw
        savings.deposit(5000);
        savings.withdraw(10000);

        System.out.println();

        current.deposit(10000);
        current.withdraw(20000);

        System.out.println();

        // Runtime polymorphism
        savings.displayDetails();

        System.out.println();

        current.displayDetails();

        System.out.println();

        // Interface behavior
        Loanable savingsLoan = (Loanable) savings;
        Loanable currentLoan = (Loanable) current;

        savingsLoan.applyForLoan();
        System.out.println(
                "Savings Loan Eligible: "
                        + savingsLoan.calculateLoanEligibility()
        );

        currentLoan.applyForLoan();
        System.out.println(
                "Current Loan Eligible: "
                        + currentLoan.calculateLoanEligibility()
        );
    }
}