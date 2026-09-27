package javaMethods.level2;

import java.util.Scanner;

/**
 * Problem 2 (GCR — Java Methods Level 2 Assignment)
 * Find the sum of n natural numbers using recursion
 * and compare the result with the formula n*(n+1)/2.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class SumNaturalNumbersRecursion {

    // Method to find sum using recursion
    public static int sumUsingRecursion(int number) {

        // Base case
        if (number == 1) {
            return 1;
        }

        // Recursive call
        return number + sumUsingRecursion(number - 1);
    }

    // Method to find sum using formula
    public static int sumUsingFormula(int number) {
        return number * (number + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check whether number is natural
        if (number <= 0) {
            System.out.println("Please enter a natural number.");
            input.close();
            return;
        }

        // Calculate sum using recursion
        int recursiveSum = sumUsingRecursion(number);

        // Calculate sum using formula
        int formulaSum = sumUsingFormula(number);

        // Display results
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        // Compare both results
        if (recursiveSum == formulaSum) {
            System.out.println("Both results are correct.");
        } else {
            System.out.println("Results are different.");
        }

        input.close();
    }
}
