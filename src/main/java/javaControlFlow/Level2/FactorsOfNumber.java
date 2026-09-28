package javaControlFlow.level2;

import java.util.Scanner;

/**
 * Problem 11 (GCR — Control Flow Level 2 Assignment)
 * Create a program to find the factors of a number taken as user input.
 * Check each number from 1 to number - 1 and print the factors.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the number as input
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Check all numbers from 1 to number - 1
        for (int i = 1; i < number; i++) {

            // Check if i perfectly divides the number
            if (number % i == 0) {
                System.out.println(i);
            }
        }

        input.close();
    }
}
