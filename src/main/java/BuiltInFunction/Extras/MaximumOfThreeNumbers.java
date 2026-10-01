package javaExtras.level1;

import java.util.Scanner;

/**
 * Problem 2 (GCR — Java Extras Level 1 Assignment)
 * Take three integer inputs from the user and find
 * the maximum of the three numbers.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class MaximumOfThreeNumbers {

    // Method to find maximum of three numbers
    public static int findMaximum(
            int firstNumber,
            int secondNumber,
            int thirdNumber) {

        int maximum = firstNumber;

        if (secondNumber > maximum) {
            maximum = secondNumber;
        }

        if (thirdNumber > maximum) {
            maximum = thirdNumber;
        }

        return maximum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take first number
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        // Take second number
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        // Take third number
        System.out.print("Enter third number: ");
        int thirdNumber = input.nextInt();

        // Call method
        int maximum = findMaximum(
                firstNumber,
                secondNumber,
                thirdNumber
        );

        // Display result
        System.out.println("Maximum number: " + maximum);

        input.close();
    }
}
