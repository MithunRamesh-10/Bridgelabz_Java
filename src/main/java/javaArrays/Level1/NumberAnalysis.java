package javaArrays.level1;

import java.util.Scanner;

/**
 * Problem 2 (GCR — Java Arrays Level 1 Assignment)
 * Take 5 numbers in an array and check whether each number is positive,
 * negative, or zero. For positive numbers, also check even or odd.
 * Finally, compare the first and last elements of the array.
 *
 * Author : Mithun
 * Date : 22-09-2026
 */
public class NumberArrayCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an array to store 5 numbers
        int[] numbers = new int[5];

        // Take input for all elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Check each number
        for (int i = 0; i < numbers.length; i++) {

            // Check if the number is positive
            if (numbers[i] > 0) {

                // Check if positive number is even or odd
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive and Even");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd");
                }
            }
            // Check if the number is negative
            else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            }
            // Number is zero
            else {
                System.out.println(numbers[i] + " is Zero");
            }
        }

        // Compare the first and last elements
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and last elements are equal.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is greater than last element.");
        } else {
            System.out.println("First element is less than last element.");
        }

        input.close();
    }
}
