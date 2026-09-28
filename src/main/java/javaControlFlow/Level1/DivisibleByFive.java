package javaControlFlow.level1;

import java.util.Scanner;

/**
 * Problem 1 (GCR — Control Flow Assignment)
 * Write a program to check if a number is divisible by 5.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number from the user
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Check whether the number is divisible by 5
        boolean isDivisible = number % 5 == 0;

        // Display the result
        System.out.println("Is the number " + number +
                " divisible by 5? " + isDivisible);

        input.close();
    }
}
