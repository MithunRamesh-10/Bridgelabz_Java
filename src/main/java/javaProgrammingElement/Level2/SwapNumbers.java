package javaProgrammingElements.level2;

import java.util.Scanner;

/**
 * Problem 7 (GCR — Java Programming Elements Assignment)
 * Take two numbers as input and swap their values.
 *
 * Author : Mithun
 * Date : 19-09-2026
 */
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the first number
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        // Take the second number
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        // Store the first number temporarily
        int temp = number1;

        // Swap the values
        number1 = number2;
        number2 = temp;

        // Display the swapped numbers
        System.out.println("The swapped numbers are " +
                number1 + " and " + number2);

        input.close();
    }
}
