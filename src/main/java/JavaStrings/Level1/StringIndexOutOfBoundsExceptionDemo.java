package javaString.level1;

import java.util.Scanner;

/**
 * Problem 5 (GCR — Java String Level 1 Assignment)
 * Write a program to demonstrate StringIndexOutOfBoundsException
 * and handle the exception using try-catch.
 *
 * Author : Mithun
 * Date : 25-09-2026
 */
public class StringIndexOutOfBoundsExceptionDemo {

    // Generate StringIndexOutOfBoundsException
    public static void generateException(String text) {

        // Access an index beyond the string length
        System.out.println(text.charAt(text.length()));
    }

    // Demonstrate and handle the exception
    public static void handleException(String text) {

        try {
            // Access an index beyond the string length
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println(
                    "StringIndexOutOfBoundsException handled: "
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

        // The following method generates the exception and stops execution.
        // Uncomment it to see the exception being generated.
        // generateException(text);

        // Handle the exception using try-catch
        handleException(text);

        input.close();
    }
}
