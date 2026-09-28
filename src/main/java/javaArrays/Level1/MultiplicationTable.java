package javaArrays.level1;

import java.util.Scanner;

/**
 * Problem 3 (GCR — Java Arrays Level 1 Assignment)
 * Create a multiplication table of a number using an array.
 * Store the results from 1 to 10 in the array and display them.
 *
 * Author : Mithun
 * Date : 22-09-2026
 */
public class MultiplicationTableArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the number as input
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Create an array to store multiplication results
        int[] multiplicationTable = new int[10];

        // Calculate and store multiplication results
        for (int i = 1; i <= multiplicationTable.length; i++) {
            multiplicationTable[i - 1] = number * i;
        }

        // Display the multiplication table
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println(number + " * " + (i + 1) +
                    " = " + multiplicationTable[i]);
        }

        input.close();
    }
}
