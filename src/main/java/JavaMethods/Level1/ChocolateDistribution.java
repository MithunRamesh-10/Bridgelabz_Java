package javaMethods.level1;

import java.util.Scanner;

/**
 * Problem 10 (GCR — Java Methods Level 1 Assignment)
 * Divide N chocolates equally among M children.
 * Find the chocolates each child gets and the remaining chocolates.
 *
 * Author : Hemang
 * Date : 23-09-2026
 */
public class DivideChocolates {

    // Method to find chocolates per child and remaining chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int chocolatesPerChild = number / divisor;
        int remainingChocolates = number % divisor;

        // Return chocolates per child and remaining chocolates
        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number of chocolates
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        // Take number of children
        System.out.print("Enter number of children: ");
        int numberOfChildren = input.nextInt();

        // Call method
        int[] result = findRemainderAndQuotient(
                numberOfChocolates,
                numberOfChildren
        );

        // Display results
        System.out.println("Chocolates per child: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);

        input.close();
    }
}
