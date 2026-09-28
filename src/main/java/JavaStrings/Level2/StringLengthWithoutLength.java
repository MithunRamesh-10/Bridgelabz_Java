package javaString.level2;

import java.util.Scanner;

/**
 * Problem 1 (GCR — Java String Level 2 Assignment)
 * Find and return the length of a string without using
 * the built-in length() method.
 *
 * Author : Mithun
 * Date : 25-09-2026
 */
public class StringLength {

    // Find string length using charAt() and exception handling
    public static int findLength(String text) {
        int count = 0;

        try {
            // Continue until charAt() throws an exception
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException exception) {
            // Exception indicates that the end of the string is reached
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string: ");
        String text = input.next();

        // Find length using user-defined method
        int userDefinedLength = findLength(text);

        // Find length using built-in method
        int builtInLength = text.length();

        // Display both results
        System.out.println("Length using user-defined method: "
                + userDefinedLength);
        System.out.println("Length using length(): "
                + builtInLength);

        input.close();
    }
}
