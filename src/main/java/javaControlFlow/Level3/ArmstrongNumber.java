package javaControlFlow.level3;

import java.util.Scanner;

/**
 * Problem 1 (GCR — Control Flow Level 3 Assignment)
 * Check whether a number is an Armstrong number.
 * An Armstrong number is a number whose sum of cubes of its digits
 * is equal to the original number, for example 153.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the number as input
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Store the original number
        int originalNumber = number;

        // Initialize sum
        int sum = 0;

        // Process each digit of the number
        while (number != 0) {

            // Find the last digit
            int digit = number % 10;

            // Add the cube of the digit to sum
            sum = sum + (digit * digit * digit);

            // Remove the last digit
            number = number / 10;
        }

        // Check whether sum is equal to original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong Number");
        }

        input.close();
    }
}
