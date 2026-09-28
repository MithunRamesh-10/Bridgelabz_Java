package javaControlFlow.level1;

import java.util.Scanner;

/**
 * Problem 2 (GCR — Control Flow Assignment)
 * Write a program to check if the first is the smallest of the 3 numbers.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take three numbers from the user
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter third number: ");
        int number3 = input.nextInt();

        // Check whether the first number is the smallest
        boolean isSmallest = number1 < number2 && number1 < number3;

        // Display the result
        System.out.println("Is the first number the smallest? " + isSmallest);

        input.close();
    }
}
