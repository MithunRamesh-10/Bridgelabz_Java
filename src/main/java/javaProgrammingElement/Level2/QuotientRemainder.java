package javaProgrammingElements.level2;

import java.util.Scanner;

/**
 * Problem 1 (GCR — Java Programming Elements Assignment)
 * Take two integer numbers and find the quotient and remainder.
 *
 * Author : Mithun
 * Date : 19-09-2026
 */
public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the first number from the user
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        // Take the second number from the user
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        // Calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Display the result
        System.out.println("The Quotient is " + quotient +
                " and Remainder is " + remainder +
                " of two numbers " + number1 + " and " + number2);

        input.close();
    }
}
