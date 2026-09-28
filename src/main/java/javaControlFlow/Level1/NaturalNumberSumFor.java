package javaControlFlow.level1;

import java.util.Scanner;

/**
 * Problem 13 (GCR — Control Flow Assignment)
 * Rewrite program 12 using for loop instead of while loop
 * to find the sum of n natural numbers.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class SumNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number from the user
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Check whether the number is natural
        if (number > 0) {
            // Initialize sum
            int sum = 0;

            // Calculate sum using for loop
            for (int i = 1; i <= number; i++) {
                sum = sum + i;
            }

            // Calculate sum using formula
            int formulaSum = number * (number + 1) / 2;

            // Display both results
            System.out.println("Sum using for loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);

            // Compare both results
            System.out.println("Both results are correct: " + (sum == formulaSum));
        } else {
            // Display message for non-natural number
            System.out.println("The number " + number + " is not a natural number");
        }

        input.close();
    }
}
