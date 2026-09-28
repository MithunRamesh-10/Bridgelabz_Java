package javaArrays.level1;

import java.util.Scanner;

/**
 * Problem 5 (GCR — Java Arrays Level 1 Assignment)
 * Create the multiplication table of a number from 6 to 9.
 * Store the multiplication results in an array and display them.
 *
 * Author : Mithun
 * Date : 22-09-2026
 */
public class MultiplicationTable6To9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the number as input
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Create an array to store results from 6 to 9
        int[] multiplicationResult = new int[4];

        // Calculate and store multiplication results
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Display the multiplication results
        for (int i = 0; i < multiplicationResult.length; i++) {
            int multiplier = i + 6;

            System.out.println(number + " * " + multiplier +
                    " = " + multiplicationResult[i]);
        }

        input.close();
    }
}
