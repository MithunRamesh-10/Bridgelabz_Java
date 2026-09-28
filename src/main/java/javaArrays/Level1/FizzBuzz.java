package javaArrays.level1;

import java.util.Scanner;

/**
 * Problem 10 (GCR — Java Arrays Level 1 Assignment)
 * Create a FizzBuzz program and save the results in a String array.
 * For multiples of 3 save "Fizz", multiples of 5 save "Buzz",
 * and multiples of both save "FizzBuzz", then display each position.
 *
 * Author : Mithun
 * Date : 22-09-2026
 */
public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the number as input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Validate the input
        if (number <= 0) {
            System.out.println("Invalid Number.");
            input.close();
            return;
        }

        // Create a String array from 0 to number
        String[] results = new String[number + 1];

        // Store FizzBuzz results in the array
        for (int i = 0; i <= number; i++) {

            // Check multiples of both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            }
            // Check multiples of 3
            else if (i % 3 == 0) {
                results[i] = "Fizz";
            }
            // Check multiples of 5
            else if (i % 5 == 0) {
                results[i] = "Buzz";
            }
            // Store the number as a String
            else {
                results[i] = String.valueOf(i);
            }
        }

        // Display the results with their positions
        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + (i + 1) +
                    " = " + results[i]);
        }

        input.close();
    }
}
