package JavaStrings.Extras;

import java.util.Scanner;

/**
 * Problem 11 (GCR — Java Strings Level 1 Assignment)
 * Check whether two strings are anagrams of each other.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class AnagramChecker {

    // Method to check whether two strings are anagrams
    public static boolean areAnagrams(
            String firstString,
            String secondString) {

        firstString = firstString.toLowerCase();
        secondString = secondString.toLowerCase();

        if (firstString.length() != secondString.length()) {
            return false;
        }

        for (int i = 0; i < firstString.length(); i++) {

            char character = firstString.charAt(i);
            int firstFrequency = 0;
            int secondFrequency = 0;

            for (int j = 0; j < firstString.length(); j++) {

                if (firstString.charAt(j) == character) {
                    firstFrequency++;
                }

                if (secondString.charAt(j) == character) {
                    secondFrequency++;
                }
            }

            if (firstFrequency != secondFrequency) {
                return false;
            }
        }

        return true;
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
        boolean result = areAnagrams(
                firstString,
                secondString
        );

        // Display result
        if (result) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        input.close();
    }
}