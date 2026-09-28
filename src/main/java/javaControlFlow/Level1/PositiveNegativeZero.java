package javaControlFlow.level1;

import java.util.Scanner;

/**
 * Problem 6 (GCR — Control Flow Assignment)
 * Write a program to check whether a number is positive,
 * negative, or zero.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class NumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number from the user
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Check whether the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        input.close();
    }
}
