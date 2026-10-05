package javaObjectModeling;

/**
 * Problem 2: Bank and Account Holders - Association
 *
 * Demonstrates an association relationship between Bank
 * and Customer objects.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class BankAccountHolders {

    static class Bank {
        String bankName;

        Bank(String bankName) {
            this.bankName = bankName;
        }

        void openAccount(Customer customer) {
            System.out.println(
                    "Account opened for " + customer.name
                            + " in " + bankName
            );
        }
    }

    static class Customer {
        String name;
        double balance;

        Customer(String name, double balance) {
            this.name = name;
            this.balance = balance;
        }

        void viewBalance() {
            System.out.println(
                    name + "'s balance: " + balance
            );
        }
    }

    public static void main(String[] args) {

        // Create Bank and Customer objects
        Bank bank = new Bank("State Bank");
        Customer customer1 = new Customer("Rahul", 25000);
        Customer customer2 = new Customer("Priya", 40000);

        // Associate customers with the bank
        bank.openAccount(customer1);
        bank.openAccount(customer2);

        // Customers view their balances
        customer1.viewBalance();
        customer2.viewBalance();
    }
}
