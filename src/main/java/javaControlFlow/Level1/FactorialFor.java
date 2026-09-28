package javaControlFlow.level1;

import java.util.Scanner;

/**
 * Problem 15 (GCR — Control Flow Assignment)
 * Rewrite program 14 using for loop.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class FactorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number from the user
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Check whether the number is positive
        if (number >= 0) {
            // Initialize factorial
            long factorial = 1;

            // Calculate factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }

            // Display the factorial
            System.out.println("The factorial of " + number +
                    " is " + factorial);
        } else {
            // Display message for negative number
            System.out.println("Please enter a positive integer.");
        }

        input.close();
    }
}
