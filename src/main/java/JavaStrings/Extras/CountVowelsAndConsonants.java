package JavaStrings.Extras;

import java.util.Scanner;

/**
 * Problem 1 (GCR — Java Strings Level 1 Assignment)
 * Count the number of vowels and consonants in a given string.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class CountVowelsAndConsonants {

    // Method to count vowels and consonants
    public static int[] countVowelsAndConsonants(String text) {

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {

            char character = Character.toLowerCase(text.charAt(i));

            if (character >= 'a' && character <= 'z') {

                if (character == 'a' ||
                        character == 'e' ||
                        character == 'i' ||
                        character == 'o' ||
                        character == 'u') {

                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Call method
        int[] result = countVowelsAndConsonants(text);

        // Display results
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);

        input.close();
    }
}
