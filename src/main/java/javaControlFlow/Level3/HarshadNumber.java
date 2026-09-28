package javaControlFlow.level3;

import java.util.Scanner;

/**
 * Problem 3 (GCR — Control Flow Level 3 Assignment)
 * Check whether a number is a Harshad Number.
 * A Harshad number is divisible by the sum of its digits,
 * for example 21 because 2 + 1 = 3 and 21 is divisible by 3.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the number as input
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Store the original number
        int originalNumber = number;

        // Initialize sum of digits
        int sum = 0;

        // Find the sum of all digits
        while (number != 0) {

            // Find the last digit
            int digit = number % 10;

            // Add digit to sum
            sum = sum + digit;

            // Remove the last digit
            number = number / 10;
        }

        // Check whether number is divisible by digit sum
        if (sum != 0 && originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number");
        }

        input.close();
    }
}
