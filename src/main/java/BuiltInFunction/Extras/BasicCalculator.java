package javaExtras.level1;

import java.util.Scanner;

/**
 * Problem 9 (GCR — Java Extras Level 1 Assignment)
 * Perform basic mathematical operations:
 * addition, subtraction, multiplication, and division.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class BasicCalculator {

    // Method to perform addition
    public static double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    // Method to perform subtraction
    public static double subtract(
            double firstNumber,
            double secondNumber) {

        return firstNumber - secondNumber;
    }

    // Method to perform multiplication
    public static double multiply(
            double firstNumber,
            double secondNumber) {

        return firstNumber * secondNumber;
    }

    // Method to perform division
    public static double divide(
            double firstNumber,
            double secondNumber) {

        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take first number
        System.out.print("Enter first number: ");
        double firstNumber = input.nextDouble();

        // Take second number
        System.out.print("Enter second number: ");
        double secondNumber = input.nextDouble();

        // Display operations
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        // Take operation choice
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        double result;

        // Perform selected operation
        switch (choice) {

            case 1:
                result = add(firstNumber, secondNumber);
                System.out.println("Result: " + result);
                break;

            case 2:
                result = subtract(firstNumber, secondNumber);
                System.out.println("Result: " + result);
                break;

            case 3:
                result = multiply(firstNumber, secondNumber);
                System.out.println("Result: " + result);
                break;

            case 4:
                if (secondNumber == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    result = divide(firstNumber, secondNumber);
                    System.out.println("Result: " + result);
                }
                break;

            default:
                System.out.println("Invalid choice.");
        }

        input.close();
    }
}