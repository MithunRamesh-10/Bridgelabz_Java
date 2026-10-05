package JavaAccessModifiers.Level1;

import java.util.Scanner;

/**
 * Problem 3 (GCR — Java Access Modifiers Level 1 Assignment)
 * Create a BankAccount class with public, protected, and private members.
 * Demonstrate balance access through public methods and access to
 * accountNumber and accountHolder through a subclass.
 *
 * Author : Mithun
 * Date : 03-10-2026
 */

class BankAccount {

    // Public member
    public String accountNumber;

    // Protected member
    protected String accountHolder;

    // Private member
    private double balance;

    // Public method to set private balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Public method to get private balance
    public double getBalance() {
        return balance;
    }
}

// Subclass demonstrating protected and public access
class SavingsAccount extends BankAccount {

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
    }
}

public class BankAccountManagement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        SavingsAccount account = new SavingsAccount();

        System.out.print("Enter account number: ");
        account.accountNumber = input.nextLine();

        System.out.print("Enter account holder name: ");
        account.accountHolder = input.nextLine();

        System.out.print("Enter balance: ");
        double balance = input.nextDouble();

        account.setBalance(balance);

        System.out.println("\nBank Account Details:");
        account.displayAccountDetails();

        input.close();
    }
}