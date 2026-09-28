package javaControlFlow.level2;

import java.util.Scanner;

/**
 * Problem 9 (GCR — Control Flow Level 2 Assignment)
 * Find and print the greatest factor of a number beside itself.
 * The loop starts from number - 1 and stops when the greatest factor is found.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class GreatestFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the number as input
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Initialize greatest factor
        int greatestFactor = 1;

        // Check factors from number - 1 down to 1
        for (int i = number - 1; i >= 1; i--) {

            // Check if i perfectly divides the number
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        // Display the greatest factor
        System.out.println("The greatest factor of " + number +
                " beside itself is " + greatestFactor);

        input.close();
    }
}
