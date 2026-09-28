package javaString.level2;

import java.util.Scanner;

/**
 * Problem 6 (GCR — Java String Level 2 Assignment)
 * Find vowels and consonants in a string and display the
 * character type as Vowel, Consonant, or Not a Letter.
 *
 * Author : Mithun
 * Date : 25-09-2026
 */
public class CharacterType {

    // Check whether a character is vowel, consonant, or not a letter
    public static String checkCharacter(char character) {

        // Convert uppercase letter to lowercase using ASCII
        if (character >= 'A' && character <= 'Z') {
            character = (char) (character + 32);
        }

        // Check for vowels
        if (character == 'a' || character == 'e'
                || character == 'i' || character == 'o'
                || character == 'u') {
            return "Vowel";
        }

        // Check for consonants
        if (character >= 'a' && character <= 'z') {
            return "Consonant";
        }

        // Character is not a letter
        return "Not a Letter";
    }

    // Return each character and its type in a 2D array
    public static String[][] findCharacterTypes(String text) {
        String[][] result = new String[text.length()][2];

        // Store character and its type
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            result[i][0] = String.valueOf(character);
            result[i][1] = checkCharacter(character);
        }

        return result;
    }

    // Display the 2D array in tabular format
    public static void displayCharacterTypes(String[][] result) {

        System.out.printf("%-12s %-15s%n",
                "Character", "Type");

        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-12s %-15s%n",
                    result[i][0], result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Find character types
        String[][] result = findCharacterTypes(text);

        // Display result
        displayCharacterTypes(result);

        input.close();
    }
}
