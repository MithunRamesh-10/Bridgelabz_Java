package javaString.level1;

import java.util.Scanner;

/**
 * Problem 9 (GCR — Java String Level 1 Assignment)
 * Write a program to convert the complete text to uppercase
 * and compare the result with the built-in String method.
 *
 * Author : Mithun
 * Date : 25-09-2026
 */
public class UpperCase {

    // Convert text to uppercase using charAt() and ASCII values
    public static String convertToUpperCase(String text) {
        String result = "";

        // Check each character
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            // Convert lowercase character to uppercase
            if (character >= 'a' && character <= 'z') {
                character = (char) (character - 32);
            }

            result = result + character;
        }

        return result;
    }

    // Compare two strings using charAt()
    public static boolean compareStrings(
            String first, String second) {

        // Check if lengths are different
        if (first.length() != second.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take complete text input
        System.out.print("Enter text: ");
        String text = input.nextLine();

        // Convert using user-defined method
        String userDefinedResult = convertToUpperCase(text);

        // Convert using built-in method
        String builtInResult = text.toUpperCase();

        // Compare both results
        boolean result =
                compareStrings(userDefinedResult, builtInResult);

        // Display results
        System.out.println("Uppercase using charAt(): "
                + userDefinedResult);
        System.out.println("Uppercase using built-in method: "
                + builtInResult);
        System.out.println("Both results are same: " + result);

        input.close();
    }
}
