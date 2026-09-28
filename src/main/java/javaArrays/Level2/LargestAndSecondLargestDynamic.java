package javaArrays.level2;

import java.util.Scanner;

/**
 * Problem 4 (GCR — Java Arrays Level 2 Assignment)
 * Rework the largest and second largest digit program by increasing
 * the array size by 10 whenever the current array becomes full.
 * This allows all digits of the number to be stored and checked.
 *
 * Author : Mithun
 * Date : 22-09-2026
 */
public class LargestSecondLargestDynamic {
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

        // Set initial array size
        int maxDigit = 10;

        // Create the digits array
        int[] digits = new int[maxDigit];

        // Initialize the array index
        int index = 0;

        // Store all digits in the array
        while (number != 0) {

            // Increase array size if it becomes full
            if (index == maxDigit) {
                maxDigit += 10;

                // Create a temporary larger array
                int[] temp = new int[maxDigit];

                // Copy old digits into the temporary array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                // Assign the larger array
                digits = temp;
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
