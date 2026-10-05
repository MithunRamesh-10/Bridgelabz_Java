package javaInheritance.hierarchicalInheritance;

/**
 * Problem 1: Bank Account Types
 * Demonstrates hierarchical inheritance.
 *
 * Author : Mithun
 * Date : 02-10-2026
 */

class BankAccount {

    String accountNumber;
    double balance;

    // Constructor to initialize account details
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Display common account details
    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Display savings account type
    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {

    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance,
                    double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Display checking account type
    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        displayAccountDetails();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {

    double interestRate;

    FixedDepositAccount(String accountNumber, double balance,
                        double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Display fixed deposit account type
    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class BankAccountTypes {

    public static void main(String[] args) {

        // Create objects of different subclasses
        SavingsAccount savings = new SavingsAccount("SA1001", 50000, 6.5);

        CheckingAccount checking = new CheckingAccount("CA1002", 30000, 10000);

        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD1003", 100000, 7.0);

        // Display account details
        savings.displayAccountType();

        System.out.println();

        checking.displayAccountType();

        System.out.println();

        fixedDeposit.displayAccountType();
    }
}