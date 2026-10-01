package JavaStrings.Extras;

import java.util.Scanner;

/**
 * Problem 4 (GCR — Java Strings Level 1 Assignment)
 * Remove all duplicate characters from a given string.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class RemoveDuplicatesFromString {

    // Method to remove duplicate characters
    public static String removeDuplicates(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char currentCharacter = text.charAt(i);
            boolean isDuplicate = false;

            for (int j = 0; j < result.length(); j++) {

                if (currentCharacter == result.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result = result + currentCharacter;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Call method
        String result = removeDuplicates(text);

        // Display result
        System.out.println("String after removing duplicates: " + result);

        input.close();
    }
}