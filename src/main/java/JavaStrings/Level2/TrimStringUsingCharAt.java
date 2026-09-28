package javaString.level2;

import java.util.Scanner;

/**
 * Problem 7 (GCR — Java String Level 2 Assignment)
 * Trim the leading and trailing spaces from a string
 * using the charAt() method and compare with trim().
 *
 * Author : Mithun
 * Date : 25-09-2026
 */
public class TrimSpaces {

    // Find starting and ending positions without spaces
    public static int[] findTrimPositions(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Find first non-space character
        while (start < text.length()
                && text.charAt(start) == ' ') {
            start++;
        }

        // Find last non-space character
        while (end >= 0
                && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Create substring using charAt()
    public static String createSubstring(
            String text, int start, int end) {

        String result = "";

        // Extract characters from start to end
        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    // Compare two strings using charAt()
    public static boolean compareStrings(
            String first, String second) {

        // Check string lengths
        if (first.length() != second.length()) {
            return false;
        }

        // Compare every character
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take complete text input
        System.out.print("Enter text with spaces: ");
        String text = input.nextLine();

        // Find trim positions
        int[] positions = findTrimPositions(text);

        String userDefinedResult = "";

        // Create trimmed substring if text contains non-space characters
        if (positions[0] <= positions[1]) {
            userDefinedResult = createSubstring(
                    text, positions[0], positions[1]);
        }

        // Use built-in trim()
        String builtInResult = text.trim();

        // Compare both results
        boolean result =
                compareStrings(userDefinedResult, builtInResult);

        // Display results
        System.out.println(
                "Trimmed using charAt(): ["
                        + userDefinedResult + "]");

        System.out.println(
                "Trimmed using trim(): ["
                        + builtInResult + "]");

        System.out.println("Both results are same: " + result);

        input.close();
    }
}
