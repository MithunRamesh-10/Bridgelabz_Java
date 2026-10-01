package JavaStrings.Extras;

import java.util.Scanner;

/**
 * Problem 10 (GCR — Java Strings Level 1 Assignment)
 * Remove all occurrences of a specific character from a string.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class RemoveSpecificCharacter {

    // Method to remove a specific character
    public static String removeCharacter(
            String text,
            char characterToRemove) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) != characterToRemove) {
                result = result + text.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Take character input
        System.out.print("Enter character to remove: ");
        char characterToRemove = input.next().charAt(0);

        // Call method
        String result = removeCharacter(
                text,
                characterToRemove
        );

        // Display result
        System.out.println("Modified String: " + result);

        input.close();
    }
}