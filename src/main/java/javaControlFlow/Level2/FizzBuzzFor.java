package javaControlFlow.level2;

import java.util.Scanner;

/**
 * Problem 5 (GCR — Control Flow Level 2 Assignment)
 * Write a FizzBuzz program using a for loop. For multiples of 3 print "Fizz",
 * for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz".
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class FizzBuzzFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the number as input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check whether the number is positive
        if (number > 0) {

            // Loop from 0 to the given number
            for (int i = 0; i <= number; i++) {

                // Check multiples of both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check multiples of 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check multiples of 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Print the number
                else {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Please enter a positive integer");
        }

        input.close();
    }
}
