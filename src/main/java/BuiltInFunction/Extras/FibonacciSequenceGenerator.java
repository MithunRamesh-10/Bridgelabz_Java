package javaExtras.level1;

import java.util.Scanner;

/**
 * Problem 4 (GCR — Java Extras Level 1 Assignment)
 * Generate the Fibonacci sequence up to a specified number
 * of terms entered by the user.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class FibonacciSequenceGenerator {

    // Method to generate and print Fibonacci sequence
    public static void generateFibonacci(int numberOfTerms) {

        int firstNumber = 0;
        int secondNumber = 1;

        System.out.print("Fibonacci Sequence: ");

        for (int i = 1; i <= numberOfTerms; i++) {

            System.out.print(firstNumber + " ");

            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number of terms
        System.out.print("Enter number of terms: ");
        int numberOfTerms = input.nextInt();

        // Call method
        generateFibonacci(numberOfTerms);

        input.close();
    }
}