package javaString.level1;

import java.util.Scanner;

/**
 * Problem 10 (GCR — Java String Level 1 Assignment)
 * Write a program to convert the complete text to lowercase
 * and compare the result with the built-in String method.
 *
 * Author : Mithun
 * Date : 25-09-2026
 */
public class LowerCase {

    // Convert text to lowercase using charAt() and ASCII values
    public static String convertToLowerCase(String text) {
        String result = "";

        // Check each character
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            // Convert uppercase character to lowercase
            if (character >= 'A' && character <= 'Z') {
                character = (char) (character + 32);
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
        String userDefinedResult = convertToLowerCase(text);

        // Convert using built-in method
        String builtInResult = text.toLowerCase();

        // Compare both results
        boolean result =
                compareStrings(userDefinedResult, builtInResult);

        // Display results
        System.out.println("Lowercase using charAt(): "
                + userDefinedResult);
        System.out.println("Lowercase using built-in method: "
                + builtInResult);
        System.out.println("Both results are same: " + result);

        input.close();
    }
}
