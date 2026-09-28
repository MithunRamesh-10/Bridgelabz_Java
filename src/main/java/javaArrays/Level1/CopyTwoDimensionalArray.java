package javaArrays.level1;

import java.util.Scanner;

/**
 * Problem 9 (GCR — Java Arrays Level 1 Assignment)
 * Create a 2D array and copy all its elements into a single
 * dimensional array using nested for loops.
 *
 * Author : Mithun
 * Date : 22-09-2026
 */
public class TwoDToOneDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();

        // Create the 2D array
        int[][] matrix = new int[rows][columns];

        // Take input for the 2D array
        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Create a 1D array with rows * columns elements
        int[] array = new int[rows * columns];

        // Initialize the 1D array index
        int index = 0;

        // Copy elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Display the 1D array
        System.out.println("The 1D array is:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        input.close();
    }
}
