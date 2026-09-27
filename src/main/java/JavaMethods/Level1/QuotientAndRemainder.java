package javaMethods.level1;

import java.util.Scanner;

/**
 * Problem 9 (GCR — Java Methods Level 1 Assignment)
 * Take two numbers and calculate their quotient and remainder.
 * A method returns both results in an integer array.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class QuotientRemainder {

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;

        // Return quotient and remainder
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number and divisor
        System.out.print("Enter number: ");
        int number = input.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = input.nextInt();

        // Call method
        int[] result = findRemainderAndQuotient(number, divisor);

        // Display results
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);

        input.close();
    }
}
