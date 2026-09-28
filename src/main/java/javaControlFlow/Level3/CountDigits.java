package javaControlFlow.level3;

import java.util.Scanner;

/**
 * Problem 2 (GCR — Control Flow Level 3 Assignment)
 * Create a program to count the number of digits in an integer.
 * Remove one digit at a time using a loop and increase the count.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the number as input
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Store the original number
        int originalNumber = number;

        // Initialize digit count
        int count = 0;

        // Handle zero as a one-digit number
        if (number == 0) {
            count = 1;
        } else {

            // Remove one digit in each iteration
            while (number != 0) {

                // Remove the last digit
                number = number / 10;

                // Increase the digit count
                count++;
            }
        }

        // Display the number of digits
        System.out.println("Number of digits in " +
                originalNumber + " is " + count);

        input.close();
    }
}
