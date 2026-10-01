package javaExtras.level1;

import java.util.Scanner;

/**
 * Problem 7 (GCR — Java Extras Level 1 Assignment)
 * Calculate the Greatest Common Divisor (GCD) and
 * Least Common Multiple (LCM) of two numbers using functions.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class GCDAndLCMCalculator {

    // Method to calculate GCD
    public static int calculateGCD(int firstNumber, int secondNumber) {

        while (secondNumber != 0) {

            int remainder = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = remainder;
        }

        return firstNumber;
    }

    // Method to calculate LCM
    public static int calculateLCM(
            int firstNumber,
            int secondNumber) {

        int gcd = calculateGCD(firstNumber, secondNumber);

        return (firstNumber * secondNumber) / gcd;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take first number
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        // Take second number
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        // Call GCD method
        int gcd = calculateGCD(firstNumber, secondNumber);

        // Call LCM method
        int lcm = calculateLCM(firstNumber, secondNumber);

        // Display results
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);

        input.close();
    }
}