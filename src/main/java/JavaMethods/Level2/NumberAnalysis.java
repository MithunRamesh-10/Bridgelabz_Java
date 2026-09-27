package javaMethods.level2;

import java.util.Scanner;

/**
 * Problem 9 (GCR — Java Methods Level 2 Assignment)
 * Take 5 numbers and check positive or negative.
 * For positive numbers, check even or odd and compare
 * the first and last elements.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class NumberArrayOperations {

    // Method to check whether a number is positive
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check whether a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {

        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create array for 5 numbers
        int[] numbers = new int[5];

        // Take input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Check each number
        for (int number : numbers) {

            if (isPositive(number)) {

                if (isEven(number)) {
                    System.out.println(number + " is Positive and Even");
                } else {
                    System.out.println(number + " is Positive and Odd");
                }

            } else {
                System.out.println(number + " is Negative");
            }
        }

        // Compare first and last elements
        int result = compare(numbers[0], numbers[numbers.length - 1]);

        if (result == 1) {
            System.out.println("First element is greater than last element.");
        } else if (result == 0) {
            System.out.println("First and last elements are equal.");
        } else {
            System.out.println("First element is less than last element.");
        }

        input.close();
    }
}
