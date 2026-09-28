package javaControlFlow.level1;

import java.util.Scanner;

/**
 * Problem 4 (GCR — Control Flow Assignment)
 * Write a program to check for the natural number and write
 * the sum of n natural numbers.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number from the user
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Check whether the number is a natural number
        if (number > 0) {

            // Calculate sum of n natural numbers
            int sum = number * (number + 1) / 2;

            // Display the sum
            System.out.println("The sum of " + number +
                    " natural numbers is " + sum);
        } else {

            // Display message for a non-natural number
            System.out.println("The number " + number +
                    " is not a natural number");
        }

        input.close();
    }
}
