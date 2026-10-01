package javaExtras.level1;

import java.util.Scanner;

/**
 * Problem 6 (GCR — Java Extras Level 1 Assignment)
 * Calculate the factorial of a number using a recursive function.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class FactorialUsingRecursion {

    // Method to calculate factorial using recursion
    public static long calculateFactorial(int number) {

        if (number == 0 || number == 1) {
            return 1;
        }

        return number * calculateFactorial(number - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Call method
        long factorial = calculateFactorial(number);

        // Display result
        System.out.println("Factorial of " + number + ": " + factorial);

        input.close();
    }
}