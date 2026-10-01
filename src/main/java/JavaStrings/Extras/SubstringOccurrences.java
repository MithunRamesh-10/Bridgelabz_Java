package JavaStrings.Extras;

import java.util.Scanner;

/**
 * Problem 6 (GCR — Java Strings Level 1 Assignment)
 * Count how many times a given substring occurs in a string.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class SubstringOccurrences {

    // Method to count substring occurrences
    public static int countOccurrences(
            String text,
            String substring) {

        int count = 0;

        for (int i = 0; i <= text.length() - substring.length(); i++) {

            boolean found = true;

            for (int j = 0; j < substring.length(); j++) {

                if (text.charAt(i + j) != substring.charAt(j)) {
                    found = false;
                    break;
                }
            }

            if (found) {
                count++;
                i = i + substring.length() - 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Take substring input
        System.out.print("Enter substring: ");
        String substring = input.nextLine();

        // Call method
        int result = countOccurrences(text, substring);

        // Display result
        System.out.println("Occurrences: " + result);

        input.close();
    }
}
