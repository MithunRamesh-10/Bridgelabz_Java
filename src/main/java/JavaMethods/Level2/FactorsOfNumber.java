package javaMethods.level2;

import java.util.Scanner;

/**
 * Problem 1 (GCR — Java Methods Level 2 Assignment)
 * Find the factors of a number, store them in an array,
 * and calculate their sum, product, and sum of squares.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class FactorsOfNumber {

    // Method to find and store factors in an array
    public static int[] findFactors(int number) {

        // Count the number of factors
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create array based on factor count
        int[] factors = new int[count];

        // Store factors in the array
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to find sum of factors
    public static int findSum(int[] factors) {
        int sum = 0;

        for (int factor : factors) {
            sum += factor;
        }

        return sum;
    }

    // Method to find product of factors
    public static long findProduct(int[] factors) {
        long product = 1;

        for (int factor : factors) {
            product *= factor;
        }

        return product;
    }

    // Method to find sum of squares of factors
    public static double findSumOfSquares(int[] factors) {
        double sum = 0;

        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Find factors
        int[] factors = findFactors(number);

        // Display factors
        System.out.print("Factors: ");

        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        // Calculate results
        int sum = findSum(factors);
        long product = findProduct(factors);
        double sumOfSquares = findSumOfSquares(factors);

        // Display results
        System.out.println("\nSum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);

        input.close();
    }
}
