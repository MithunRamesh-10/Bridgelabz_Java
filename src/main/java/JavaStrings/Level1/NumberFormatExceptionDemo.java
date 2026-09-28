package javaString.level1;

import java.util.Scanner;

/**
 * Problem 7 (GCR — Java String Level 1 Assignment)
 * Write a program to demonstrate NumberFormatException
 * using Integer.parseInt() and handle the exception.
 *
 * Author : Mithun
 * Date : 25-09-2026
 */
public class NumberFormatExceptionDemo {

    // Generate NumberFormatException
    public static void generateException(String text) {

        // Convert text into an integer
        int number = Integer.parseInt(text);

        System.out.println("Number: " + number);
    }

    // Demonstrate and handle NumberFormatException
    public static void handleException(String text) {

        try {
            // Convert text into an integer
            int number = Integer.parseInt(text);

            System.out.println("Number: " + number);
        } catch (NumberFormatException exception) {
            System.out.println(
                    "NumberFormatException handled: "
                            + exception.getMessage()
            );
        } catch (RuntimeException exception) {
            System.out.println(
                    "RuntimeException handled: "
                            + exception.getMessage()
            );
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take text input
        System.out.print("Enter a number as text: ");
        String text = input.next();

        // Uncomment to generate the exception directly
        // generateException(text);

        // Handle the exception
        handleException(text);

        input.close();
    }
}
