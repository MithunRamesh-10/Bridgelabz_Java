package javaControlFlow.level1;

import java.util.Scanner;

/**
 * Problem 18 (GCR — Control Flow Assignment)
 * Create a program to find the multiplication table of a number
 * entered by the user from 6 to 9.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number from the user
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Generate multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {

            // Calculate and display multiplication
            System.out.println(number + " * " + i +
                    " = " + (number * i));
        }

        input.close();
    }
}
