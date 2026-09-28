package javaArrays.level2;

import java.util.Scanner;

/**
 * Problem 5 (GCR — Java Arrays Level 2 Assignment)
 * Take a number as input, store its digits in an array,
 * create another array in reverse order, and display the reversed number.
 *
 * Author : Mithun
 * Date : 22-09-2026
 */
public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the number as input
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Validate the number
        if (number < 0) {
            System.out.println("Invalid Number.");
            input.close();
            return;
        }

        // Find the count of digits
        int count = 0;
        int temp = number;

        // Count the digits
        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                count++;
                temp /= 10;
            }
        }

        // Create an array to store the digits
        int[] digits = new int[count];

        // Store digits in the array
        temp = number;

        for (int i = 0; i < digits.length; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Create an array for reverse order
        int[] reverseDigits = new int[count];

        // Store the digits in reverse order
        for (int i = 0; i < digits.length; i++) {
            reverseDigits[i] = digits[count - 1 - i];
        }

        // Display the reversed number
        System.out.print("Reversed number: ");

        for (int i = reverseDigits.length - 1; i >= 0; i--) {
            System.out.print(reverseDigits[i]);
        }

        System.out.println();

        input.close();
    }
}
