package javaString.level2;

import java.util.Scanner;

/**
 * Problem 5 (GCR — Java String Level 2 Assignment)
 * Find vowels and consonants in a string and display
 * the count of vowels and consonants.
 *
 * Author : Mithun
 * Date : 25-09-2026
 */
public class VowelConsonantCount {

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

    // Find vowel and consonant counts using charAt()
    public static int[] findVowelConsonantCount(String text) {
        int vowels = 0;
        int consonants = 0;

        // Check every character
        for (int i = 0; i < text.length(); i++) {
            String type = checkCharacter(text.charAt(i));

            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Find vowel and consonant counts
        int[] counts = findVowelConsonantCount(text);

        // Display result
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);

        input.close();
    }
}
