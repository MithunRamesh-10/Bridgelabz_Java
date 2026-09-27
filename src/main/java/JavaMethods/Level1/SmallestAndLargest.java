package javaMethods.level1;

import java.util.Scanner;

/**
 * Problem 8 (GCR — Java Methods Level 1 Assignment)
 * Find the smallest and largest among three numbers.
 * A single method returns both results in an integer array.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class SmallestLargest {

    // Method to find smallest and largest number
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;

        // Find the smallest number
        if (number2 < smallest) {
            smallest = number2;
        }

        if (number3 < smallest) {
            smallest = number3;
        }

        // Find the largest number
        if (number2 > largest) {
            largest = number2;
        }

        if (number3 > largest) {
            largest = number3;
        }

        // Return smallest and largest in an array
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take three numbers
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter third number: ");
        int number3 = input.nextInt();

        // Call method
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display results
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);

        input.close();
    }
}
