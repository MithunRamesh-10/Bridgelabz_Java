package javaMethods.level1;

import java.util.Scanner;

/**
 * Problem 7 (GCR — Java Methods Level 1 Assignment)
 * Find the sum of the first n natural numbers using a loop.
 * The calculation is performed using a separate method.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class SumNaturalNumbers {

    // Method to calculate sum of natural numbers
    public static int calculateSum(int number) {
        int sum = 0;

        // Add numbers from 1 to number
        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Call method to calculate sum
        int sum = calculateSum(number);

        // Display result
        System.out.println("Sum of first " + number +
                " natural numbers: " + sum);

        input.close();
    }
}
