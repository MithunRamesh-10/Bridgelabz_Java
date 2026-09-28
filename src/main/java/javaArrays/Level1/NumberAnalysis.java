package javaArrays.level1;

import java.util.Scanner;

/**
 * Problem 7 (GCR — Java Arrays Level 1 Assignment)
 * Save odd and even numbers between 1 and the given number
 * into separate odd and even arrays, then display both arrays.
 *
 * Author : Mithun
 * Date : 22-09-2026
 */
public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the number as input
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Validate the input
        if (number < 1) {
            System.out.println("Invalid Number.");
            input.close();
            return;
        }

        // Create arrays for odd and even numbers
        int arraySize = number / 2 + 1;
        int[] oddNumbers = new int[arraySize];
        int[] evenNumbers = new int[arraySize];

        // Initialize indexes for both arrays
        int oddIndex = 0;
        int evenIndex = 0;

        // Store odd and even numbers in separate arrays
        for (int i = 1; i <= number; i++) {

            // Store odd number
            if (i % 2 != 0) {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
            // Store even number
            else {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            }
        }

        // Display odd numbers
        System.out.println("Odd numbers:");

        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        // Move to the next line
        System.out.println();

        // Display even numbers
        System.out.println("Even numbers:");

        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        input.close();
    }
}
