package javaString.level1;

import java.util.Scanner;

/**
 * Problem 6 (GCR — Java String Level 1 Assignment)
 * Write a program to demonstrate IllegalArgumentException
 * using substring() and handle the exception using try-catch.
 *
 * Author : Mithun
 * Date : 25-09-2026
 */
public class IllegalArgumentExceptionDemo {

    // Generate the exception using substring()
    public static void generateException(String text) {

        // Set start index greater than end index
        System.out.println(text.substring(5, 2));
    }

    // Demonstrate and handle the exception
    public static void handleException(String text) {

        try {
            // Set start index greater than end index
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException exception) {
            System.out.println(
                    "IllegalArgumentException handled: "
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

        // Take string input
        System.out.print("Enter a string: ");
        String text = input.next();

        // Uncomment to generate the exception directly
        // generateException(text);

        // Handle the runtime exception
        handleException(text);

        input.close();
    }
}
