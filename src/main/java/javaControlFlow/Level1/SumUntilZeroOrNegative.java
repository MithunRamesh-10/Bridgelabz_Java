package javaControlFlow.level1;

import java.util.Scanner;

/**
 * Problem 11 (GCR — Control Flow Assignment)
 * Rewrite the program to find the sum until the user enters
 * 0 or a negative number using while loop and break statement.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize total sum
        double total = 0.0;

        // Run an infinite while loop
        while (true) {
            // Take number from the user
            System.out.print("Enter number: ");
            double number = input.nextDouble();

            // Stop the loop if number is zero or negative
            if (number <= 0) {
                break;
            }

            // Add positive number to total
            total = total + number;
        }

        // Display the total sum
        System.out.println("The total sum is " + total);

        input.close();
    }
}
