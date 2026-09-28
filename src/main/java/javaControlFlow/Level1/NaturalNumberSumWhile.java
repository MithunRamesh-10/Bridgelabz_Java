package javaControlFlow.level1;

import java.util.Scanner;

/**
 * Problem 12 (GCR — Control Flow Assignment)
 * Find the sum of n natural numbers using while loop and
 * compare the result with the formula n*(n+1)/2.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class SumNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number from the user
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Check whether the number is natural
        if (number > 0) {
            // Initialize variables
            int sum = 0;
            int i = 1;

            // Calculate sum using while loop
            while (i <= number) {
                sum = sum + i;
                i++;
            }

            // Calculate sum using formula
            int formulaSum = number * (number + 1) / 2;

            // Display both results
            System.out.println("Sum using while loop: " + sum);
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
