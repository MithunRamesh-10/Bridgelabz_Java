package javaArrays.level1;

import java.util.Scanner;

/**
 * Problem 8 (GCR — Java Arrays Level 1 Assignment)
 * Find the factors of a number and store them in an array.
 * If the array becomes full, create a larger array with twice
 * the previous size and continue storing the factors.
 *
 * Author : Mithun
 * Date : 22-09-2026
 */
public class FactorsOfNumberArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the number as input
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Set the initial array size
        int maxFactor = 10;

        // Create the factors array
        int[] factors = new int[maxFactor];

        // Initialize the array index
        int index = 0;

        // Find factors from 1 to the given number
        for (int i = 1; i <= number; i++) {

            // Check if i is a factor
            if (number % i == 0) {

                // Increase array size if it is full
                if (index == maxFactor) {
                    maxFactor = maxFactor * 2;

                    // Create a temporary array with larger size
                    int[] temp = new int[maxFactor];

                    // Copy old elements into temporary array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    // Assign the larger array to factors
                    factors = temp;
                }

                // Store the factor
                factors[index] = i;

                // Move to the next position
                index++;
            }
        }

        // Display the factors
        System.out.println("Factors of " + number + ":");

        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        input.close();
    }
}
