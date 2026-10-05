package javaThisStaticFinal;

/**
 * Problem 1 (GCR — this, static, final keywords and instanceof Operator)
 * Create a BankAccount class using static, this, final and instanceof.
 *
 * Author : Mithun
 * Date : 30-09-2026
 */
public class BankAccount {

    // Static variable shared by all accounts
    static String bankName = "State Bank";

    // Final variable cannot be changed after initialization
    final String accountNumber;

    // Instance variable
    String accountHolderName;

    // Static variable to count total accounts
    static int totalAccounts = 0;

    // Constructor
    BankAccount(String accountHolderName, String accountNumber) {

        // this resolves ambiguity between parameter and instance variable
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;

        // Increase total account count
        totalAccounts++;
    }

    // Static method to display total accounts
    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Display account details
    void displayAccountDetails() {
        System.out.println("Bank Name      : " + bankName);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Account Number : " + accountNumber);
    }

    public static void main(String[] args) {

        // Create BankAccount objects
        BankAccount account1 =
                new BankAccount("Hemang", "ACC101");

        BankAccount account2 =
                new BankAccount("Rahul", "ACC102");

        // Check whether account1 is a BankAccount object
        if (account1 instanceof BankAccount) {
            System.out.println("Account 1 is a BankAccount.");
            account1.displayAccountDetails();
        }

        System.out.println();

        // Check whether account2 is a BankAccount object
        if (account2 instanceof BankAccount) {
            System.out.println("Account 2 is a BankAccount.");
            account2.displayAccountDetails();
        }

        System.out.println();

        // Call static method using class name
        BankAccount.getTotalAccounts();
    }
}