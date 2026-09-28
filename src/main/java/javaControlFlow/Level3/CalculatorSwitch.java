package javaControlFlow.level3;

import java.util.Scanner;

/**
 * Problem 6 (GCR — Control Flow Level 3 Assignment)
 * Create a calculator using switch...case.
 * The operator can be +, -, * or /. Perform the selected operation
 * and print the result, otherwise display Invalid Operator.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the first number
        System.out.print("Enter first number: ");
        double first = input.nextDouble();

        // Take the second number
        System.out.print("Enter second number: ");
        double second = input.nextDouble();

        // Take the operator
        System.out.print("Enter operator (+, -, *, /): ");
        String op = input.next();

        // Perform the operation using switch case
        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;

            case "-":
                System.out.println("Result: " + (first - second));
                break;

            case "*":
                System.out.println("Result: " + (first * second));
                break;

            case "/":
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }

        input.close();
    }
}
