package javaString.level3;

import java.util.Scanner;

/**
 * Problem 4 (GCR — Java String Level 3 Assignment)
 * Find the frequency of characters in a string using
 * the charAt() method and display the result.
 *
 * Author : Mithun
 * Date : 25-09-2026
 */
public class CharacterFrequency {

    // Find character frequency and return character-frequency pairs
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];

        // Count frequency of every character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Count characters that occur in the text
        int uniqueCount = 0;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // Store characters and their frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(frequency[i]);
                index++;
            }
        }

        return result;
    }

    // Display character frequency
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

        // Find frequency
        String[][] result = findFrequency(text);

        // Display result
        displayFrequency(result);

        input.close();
    }
}
