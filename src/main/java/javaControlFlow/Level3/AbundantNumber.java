package javaControlFlow.level3;

import java.util.Scanner;

/**
 * Problem 4 (GCR — Control Flow Level 3 Assignment)
 * Check whether a number is an Abundant Number.
 * An abundant number has a sum of its divisors, excluding itself,
 * greater than the number itself, for example 12.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class AbundantNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the number as input
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Initialize sum of divisors
        int sum = 0;

        // Check all numbers from 1 to number - 1
        for (int i = 1; i < number; i++) {

            // Check if i is a divisor of the number
            if (number % i == 0) {

                // Add the divisor to sum
                sum = sum + i;
            }
        }

        // Check whether sum of divisors is greater than number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is not an Abundant Number");
        }

        input.close();
    }
}
