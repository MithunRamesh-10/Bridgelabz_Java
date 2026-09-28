package javaProgrammingElements.level1;

import java.util.Scanner;

/**
 * Problem 11 (GCR — Java Programming Elements Assignment)
 * Take two floating-point numbers and perform addition, subtraction,
 * multiplication and division.
 *
 * Author : Mithun
 * Date : 19-09-2026
 */
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the first number from the user
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        // Take the second number from the user
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        // Perform addition
        double addition = number1 + number2;

        // Perform subtraction
        double subtraction = number1 - number2;

        // Perform multiplication
        double multiplication = number1 * number2;

        // Perform division
        double division = number1 / number2;

        // Display all results
        System.out.println("Addition = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);

        input.close();
    }
}
