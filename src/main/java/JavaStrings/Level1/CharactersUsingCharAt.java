package javaString.level1;

import java.util.Scanner;

/**
 * Problem 3 (GCR — Java String Level 1 Assignment)
 * Write a program to return all the characters in a string using
 * a user-defined method and compare the result with toCharArray().
 *
 * Author : Mithun
 * Date : 25-09-2026
 */
public class StringCharacters {

    // Return characters without using toCharArray()
    public static char[] getCharacters(String text) {
        char[] characters = new char[text.length()];

        // Store each character in the array
        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }

        return characters;
    }

    // Compare two character arrays
    public static boolean compareArrays(
            char[] first, char[] second) {

        // Check if array lengths are different
        if (first.length != second.length) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string: ");
        String text = input.next();

        // Get characters using user-defined method
        char[] userDefinedCharacters = getCharacters(text);

        // Get characters using built-in method
        char[] builtInCharacters = text.toCharArray();

        // Compare both arrays
        boolean result =
                compareArrays(userDefinedCharacters, builtInCharacters);

        // Display results
        System.out.print("Characters using user-defined method: ");
        for (char character : userDefinedCharacters) {
            System.out.print(character + " ");
        }

        System.out.print("\nCharacters using toCharArray(): ");
        for (char character : builtInCharacters) {
            System.out.print(character + " ");
        }

        System.out.println("\nBoth results are same: " + result);

        input.close();
    }
}
