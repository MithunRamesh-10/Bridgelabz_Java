package javaControlFlow.level2;

import java.util.Scanner;

/**
 * Problem 12 (GCR — Control Flow Level 2 Assignment)
 * Create a program to find all the multiples of a number below 100.
 * Use a backward for loop and print the values that are perfectly divisible
 * by the given number.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the number as input
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Run the loop backward from 100 to 1
        for (int i = 100; i >= 1; i--) {

            // Check if i is perfectly divisible by the number
            if (i % number == 0) {
                System.out.println(i);
            }
        }

        input.close();
    }
}
