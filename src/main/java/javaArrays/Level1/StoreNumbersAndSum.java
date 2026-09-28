package javaArrays.level1;

import java.util.Scanner;

/**
 * Problem 4 (GCR — Java Arrays Level 1 Assignment)
 * Store multiple positive values in an array up to a maximum of 10 values.
 * Stop when the user enters 0 or a negative number, then display all
 * stored numbers and their sum.
 *
 * Author : Mithun
 * Date : 22-09-2026
 */
public class StoreNumbersAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an array with maximum 10 elements
        double[] numbers = new double[10];

        // Initialize the array index
        int index = 0;

        // Take input until 0, negative number, or array becomes full
        while (true) {

            // Stop if array has reached its maximum size
            if (index == numbers.length) {
                break;
            }

            // Take user input
            System.out.print("Enter a positive number: ");
            double number = input.nextDouble();

            // Stop for zero or negative number
            if (number <= 0) {
                break;
            }

            // Store the number in the array
            numbers[index] = number;

            // Move to the next array position
            index++;
        }

        // Calculate the total
        double total = 0.0;

        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display all stored numbers
        System.out.println("Numbers entered:");

        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        // Display the total
        System.out.println("Total: " + total);

        input.close();
    }
}
