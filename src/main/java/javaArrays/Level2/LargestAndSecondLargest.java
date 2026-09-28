package javaArrays.level2;

import java.util.Scanner;

/**
 * Problem 3 (GCR — Java Arrays Level 2 Assignment)
 * Store the digits of a number in an array and find the largest
 * and second largest elements in the array.
 *
 * Author : Mithun
 * Date : 22-09-2026
 */
public class LargestSecondLargestDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the number as input
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Validate the number
        if (number < 0) {
            System.out.println("Invalid Number.");
            input.close();
            return;
        }

        // Create an array with maximum size 10
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // Initialize array index
        int index = 0;

        // Store the digits in the array
        while (number != 0) {

            // Stop if the array becomes full
            if (index == maxDigit) {
                break;
            }

            // Store the last digit
            digits[index] = number % 10;

            // Remove the last digit
            number /= 10;

            // Move to the next index
            index++;
        }

        // Handle the number 0
        if (index == 0) {
            digits[index] = 0;
            index++;
        }

        // Initialize largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // Find largest and second largest
        for (int i = 0; i < index; i++) {

            // Update largest and second largest
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        input.close();
    }
}
