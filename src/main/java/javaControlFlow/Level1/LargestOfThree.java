package javaControlFlow.level1;

import java.util.Scanner;

/**
 * Problem 3 (GCR — Control Flow Assignment)
 * Write a program to check if the first, second, or third number
 * is the largest of the three.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take three numbers from the user
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter third number: ");
        int number3 = input.nextInt();

        // Check whether the first number is largest
        boolean firstLargest = number1 > number2 && number1 > number3;

        // Check whether the second number is largest
        boolean secondLargest = number2 > number1 && number2 > number3;

        // Check whether the third number is largest
        boolean thirdLargest = number3 > number1 && number3 > number2;

        // Display the results
        System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);

        input.close();
    }
}
