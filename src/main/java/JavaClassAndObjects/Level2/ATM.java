package JavaClassAndObjects.Level2;

public class ATM package JavaClassesAndObjects.Level2;

import java.util.Scanner;

/**
 * Problem 2 (GCR — Java Classes and Objects Level 2 Assignment)
 * Program to simulate an ATM.
 *
 * Create a BankAccount class with attributes accountHolder,
 * accountNumber, and balance.
 *
 * Add methods for depositing money, withdrawing money only when
 * sufficient balance exists, and displaying the current balance.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */

class BankAccount {

    String accountHolder;
    long accountNumber;
    double balance;

    // Method to deposit money
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class ATM {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        BankAccount account = new BankAccount();

        System.out.print("Enter account holder name: ");
        account.accountHolder = input.nextLine();

        System.out.print("Enter account number: ");
        account.accountNumber = input.nextLong();

        System.out.print("Enter initial balance: ");
        account.balance = input.nextDouble();

        System.out.println("\nAccount Details:");
        System.out.println("Account Holder: " + account.accountHolder);
        System.out.println("Account Number: " + account.accountNumber);
        account.displayBalance();

        System.out.print("\nEnter amount to deposit: ");
        double depositAmount = input.nextDouble();
        account.deposit(depositAmount);

        account.displayBalance();

        System.out.print("\nEnter amount to withdraw: ");
        double withdrawalAmount = input.nextDouble();
        account.withdraw(withdrawalAmount);

        account.displayBalance();

        input.close();
    }
}{
}
