package javaControlFlow.level1;

import java.util.Scanner;

/**
 * Problem 10 (GCR — Control Flow Assignment)
 * Write a program to find the sum of numbers until the user enters 0.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize total sum
        double total = 0.0;

        // Take the first number
        System.out.print("Enter number: ");
        double number = input.nextDouble();

        // Continue until the user enters 0
        while (number != 0) {

            // Add the entered number to total
            total = total + number;

            // Take the next number
            System.out.print("Enter number: ");
            number = input.nextDouble();
        }

        // Display the total
        System.out.println("The total sum is " + total);

        input.close();
    }
}
