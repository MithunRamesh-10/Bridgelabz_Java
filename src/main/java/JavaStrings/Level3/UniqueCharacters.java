package javaString.level3;

import java.util.Scanner;

/**
 * Problem 5 (GCR — Java String Level 3 Assignment)
 * Find the frequency of characters in a string using
 * unique characters and display the result.
 *
 * Author : Mithun
 * Date : 25-09-2026
 */
public class UniqueCharacterFrequency {

    // Find string length without using length()
    public static int findLength(String text) {
        int count = 0;

        try {
            // Continue until charAt() throws an exception
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException exception) {
            // End of string reached
        }

        return count;
    }

    // Find unique characters using nested loops
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);

        char[] uniqueCharacters = new char[length];
        int uniqueCount = 0;

        // Find unique characters
        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // Compare with previous characters
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            // Store unique character
            if (isUnique) {
                uniqueCharacters[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // Create final unique character array
        char[] result = new char[uniqueCount];

        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueCharacters[i];
        }

        return result;
    }

    // Find frequency of unique characters
    public static String[][] findFrequency(
            String text, char[] uniqueCharacters) {

        int[] frequency = new int[256];

        // Count frequency of every character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        String[][] result =
                new String[uniqueCharacters.length][2];

        // Store unique characters and their frequencies
        for (int i = 0; i < uniqueCharacters.length; i++) {
            char character = uniqueCharacters[i];

            result[i][0] = String.valueOf(character);
            result[i][1] =
                    String.valueOf(frequency[character]);
        }

        return result;
    }

    // Display frequency result
    public static void displayFrequency(String[][] result) {
        System.out.printf(
                "%-12s %-10s%n",
                "Character", "Frequency"
        );

        for (int i = 0; i < result.length; i++) {
            System.out.printf(
                    "%-12s %-10s%n",
                    result[i][0],
                    result[i][1]
            );
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Find unique characters
        char[] uniqueCharacters =
                findUniqueCharacters(text);

        // Find frequency of unique characters
        String[][] result =
                findFrequency(text, uniqueCharacters);

        // Display result
        displayFrequency(result);

        input.close();
    }
}
