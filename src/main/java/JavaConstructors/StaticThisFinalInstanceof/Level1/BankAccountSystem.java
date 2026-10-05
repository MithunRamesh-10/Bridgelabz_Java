package JavaConstructors.StaticThisFinalInstanceof.Level1;

import java.util.Scanner;

/**
 * Problem 1 (GCR — Java Constructors Static, This, Final and Instanceof Assignment)
 * Demonstrate static, this, final and instanceof using a Bank Account System.
 *
 * Author : Mithun
 * Date : 03-10-2026
 */

class BankAccount {

    // Static variables
    static String bankName = "State Bank";
    static int totalAccounts = 0;

    // Instance variables
    String accountHolderName;

    // Final variable
    final String accountNumber;

    // Constructor
    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;

        totalAccounts++;
    }

    // Static method
    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Display account details
    public void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }
}

public class BankAccountSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String accountHolderName = input.nextLine();

        System.out.print("Enter account number: ");
        String accountNumber = input.nextLine();

        BankAccount account = new BankAccount(
                accountHolderName,
                accountNumber
        );

        // instanceof check
        if (account instanceof BankAccount) {
            System.out.println("\nAccount Details:");
            account.displayDetails();
        }

        System.out.println();
        BankAccount.getTotalAccounts();

        input.close();
    }
}