package javaExtras.level1;

import java.util.Scanner;

/**
 * Problem 3 (GCR — Java Extras Level 1 Assignment)
 * Check whether a given number is a prime number.
 * Use a separate function to perform the prime check
 * and return the result.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class PrimeNumberChecker {

    // Method to check whether a number is prime
    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Call method
        boolean result = isPrime(number);

        // Display result
        if (result) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        input.close();
    }
}
