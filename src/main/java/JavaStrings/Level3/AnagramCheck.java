package javaString.level3;

import java.util.Scanner;

/**
 * Problem 8 (GCR — Java String Level 3 Assignment)
 * Check whether two texts are anagrams using character
 * frequency comparison.
 *
 * Author : Mithun
 * Date : 25-09-2026
 */
public class AnagramChecker {

    // Check whether two texts are anagrams
    public static boolean checkAnagram(
            String first, String second) {

        // Check whether lengths are equal
        if (first.length() != second.length()) {
            return false;
        }

        // Create frequency arrays
        int[] firstFrequency = new int[256];
        int[] secondFrequency = new int[256];

        // Find frequency of characters in first text
        for (int i = 0; i < first.length(); i++) {
            firstFrequency[first.charAt(i)]++;
        }

        // Find frequency of characters in second text
        for (int i = 0; i < second.length(); i++) {
            secondFrequency[second.charAt(i)]++;
        }

        // Compare frequencies
        for (int i = 0; i < 256; i++) {
            if (firstFrequency[i] != secondFrequency[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take two text inputs
        System.out.print("Enter first text: ");
        String first = input.nextLine();

        System.out.print("Enter second text: ");
        String second = input.nextLine();

        // Check anagram
        boolean result = checkAnagram(first, second);

        // Display result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        input.close();
    }
}
