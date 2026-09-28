package javaArrays.level2;

import java.util.Scanner;

/**
 * Problem 10 (GCR — Java Arrays Level 2 Assignment)
 * Find the frequency of each digit in a number using arrays.
 * Store the digits in an array and use a frequency array of size 10
 * to count how many times each digit occurs.
 *
 * Author : Mithun
 * Date : 22-09-2026
 */
public class DigitFrequency {
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

        // Find the number of digits
        int count = 0;
        int temp = number;

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

        // Store each digit in the array
        temp = number;

        for (int i = 0; i < digits.length; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Create frequency array for digits 0 to 9
        int[] frequency = new int[10];

        // Find the frequency of each digit
        for (int i = 0; i < digits.length; i++) {

            // Increase the frequency of the current digit
            frequency[digits[i]]++;
        }

        // Display the frequency of each digit
        System.out.println("Digit Frequency:");

        for (int i = 0; i < frequency.length; i++) {
            System.out.println(i + " = " + frequency[i]);
        }

        input.close();
    }
}
