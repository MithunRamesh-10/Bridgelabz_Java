package javaControlFlow.level2;

import java.util.Scanner;

/**
 * Problem 4 (GCR — Control Flow Level 2 Assignment)
 * Write a program to check if the given number is a prime number or not.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the number as input
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Assume the number is prime
        boolean isPrime = true;

        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            isPrime = false;
        } else {

            // Check divisibility from 2 to the number
            for (int i = 2; i < number; i++) {

                // Check if number is divisible by i
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }

        input.close();
    }
}
