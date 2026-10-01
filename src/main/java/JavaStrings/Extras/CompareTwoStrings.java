package JavaStrings.Extras;

import java.util.Scanner;

/**
 * Problem 8 (GCR — Java Strings Level 1 Assignment)
 * Compare two strings lexicographically without using
 * built-in compare methods.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class CompareTwoStrings {

    // Method to compare two strings lexicographically
    public static int compareStrings(
            String firstString,
            String secondString) {

        int minimumLength;

        if (firstString.length() < secondString.length()) {
            minimumLength = firstString.length();
        } else {
            minimumLength = secondString.length();
        }

        for (int i = 0; i < minimumLength; i++) {

            if (firstString.charAt(i) < secondString.charAt(i)) {
                return -1;
            }

            if (firstString.charAt(i) > secondString.charAt(i)) {
                return 1;
            }
        }

        if (firstString.length() < secondString.length()) {
            return -1;
        } else if (firstString.length() > secondString.length()) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take first string
        System.out.print("Enter first string: ");
        String firstString = input.nextLine();

        // Take second string
        System.out.print("Enter second string: ");
        String secondString = input.nextLine();

        // Call method
        int result = compareStrings(firstString, secondString);

        // Display result
        if (result < 0) {
            System.out.println(
                    "\"" + firstString +
                            "\" comes before \"" +
                            secondString + "\""
            );
        } else if (result > 0) {
            System.out.println(
                    "\"" + firstString +
                            "\" comes after \"" +
                            secondString + "\""
            );
        } else {
            System.out.println("Both strings are equal.");
        }

        input.close();
    }
}