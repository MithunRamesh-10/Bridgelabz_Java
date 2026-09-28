package javaString.level3;

import java.util.Scanner;

/**
 * Problem 3 (GCR — Java String Level 3 Assignment)
 * Find the first non-repeating character in a string
 * using the charAt() method.
 *
 * Author : Hemang
 * Date : 25-09-2026
 */
public class FirstNonRepeatingCharacter {

    // Find the first non-repeating character
    public static char findFirstNonRepeating(String text) {
        int[] frequency = new int[256];

        // Count frequency of every character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Find the first character with frequency one
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            if (frequency[character] == 1) {
                return character;
            }
        }

        // Return null character if none exists
        return '\0';
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Find first non-repeating character
        char result = findFirstNonRepeating(text);

        // Display result
        if (result == '\0') {
            System.out.println(
                    "No non-repeating character found."
            );
        } else {
            System.out.println(
                    "First non-repeating character: " + result
            );
        }

        input.close();
    }
}
