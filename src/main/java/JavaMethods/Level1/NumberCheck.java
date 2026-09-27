package javaMethods.level1;

import java.util.Scanner;

/**
 * Problem 5 (GCR — Java Methods Level 1 Assignment)
 * Check whether a number is positive, negative, or zero.
 * The method returns -1 for negative, 1 for positive, and 0 for zero.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class NumberSign {

    // Method to check the sign of the number
    public static int checkNumber(int number) {
        if (number < 0) {
            return -1;
        }

        if (number > 0) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Call method to check number
        int result = checkNumber(number);

        // Display result
        if (result == 1) {
            System.out.println("The number is positive");
        } else if (result == -1) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }

        input.close();
    }
}
