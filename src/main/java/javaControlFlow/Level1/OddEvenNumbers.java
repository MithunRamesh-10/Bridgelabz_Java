package javaControlFlow.level1;

import java.util.Scanner;

/**
 * Problem 16 (GCR — Control Flow Assignment)
 * Create a program to print odd and even numbers between 1
 * to the number entered by the user.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number from the user
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Check whether the number is natural
        if (number > 0) {

            // Iterate from 1 to the given number
            for (int i = 1; i <= number; i++) {

                // Check whether the number is even
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    // Otherwise the number is odd
                    System.out.println(i + " is Odd");
                }
            }
        } else {
            // Display message for non-natural number
            System.out.println("The number " + number +
                    " is not a natural number");
        }

        input.close();
    }
}
