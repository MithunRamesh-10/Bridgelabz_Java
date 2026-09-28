package javaControlFlow.level1;

import java.util.Scanner;

/**
 * Problem 14 (GCR — Control Flow Assignment)
 * Find the factorial of an integer entered by the user using
 * a while loop.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number from the user
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Check whether the number is positive
        if (number >= 0) {
            // Initialize factorial and counter
            long factorial = 1;
            int i = 1;

            // Calculate factorial using while loop
            while (i <= number) {
                factorial = factorial * i;
                i++;
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
