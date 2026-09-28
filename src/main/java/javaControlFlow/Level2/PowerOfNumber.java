package javaControlFlow.level2;

import java.util.Scanner;

/**
 * Problem 10 (GCR — Control Flow Level 2 Assignment)
 * Create a program to find the power of a number.
 * Take the number and power as input and calculate the result using a for loop.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the number as input
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Take the power as input
        System.out.print("Enter power: ");
        int power = input.nextInt();

        // Initialize result to 1
        int result = 1;

        // Multiply number by itself power times
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }

        // Display the result
        System.out.println(number + " raised to the power " +
                power + " is " + result);

        input.close();
    }
}
