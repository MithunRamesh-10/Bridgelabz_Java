package javaProgrammingElements.level2;

import java.util.Scanner;

/**
 * Problem 6 (GCR — Java Programming Elements Assignment)
 * Create a program to find the total income of a person
 * by taking salary and bonus from user.
 *
 * Author : Mithun
 * Date : 19-09-2026
 */
public class TotalIncome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take salary from the user
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        // Take bonus from the user
        System.out.print("Enter bonus: ");
        double bonus = input.nextDouble();

        // Calculate total income
        double totalIncome = salary + bonus;

        // Display the total income
        System.out.println("The salary is INR " + salary +
                " and bonus is INR " + bonus +
                ". Hence Total Income is INR " + totalIncome);

        input.close();
    }
}
