package JavaStrings.Extras;

import java.util.Scanner;

/**
 * Problem 7 (GCR — Java Strings Level 1 Assignment)
 * Toggle the case of every character in a given string.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class ToggleCaseOfCharacters {

    // Method to toggle character case
    public static String toggleCase(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char character = text.charAt(i);

            if (character >= 'A' && character <= 'Z') {
                result = result + (char) (character + 32);
            } else if (character >= 'a' && character <= 'z') {
                result = result + (char) (character - 32);
            } else {
                result = result + character;
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
        String result = toggleCase(text);

        // Display result
        System.out.println("Toggled String: " + result);

        input.close();
    }
}