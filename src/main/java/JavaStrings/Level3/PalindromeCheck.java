package javaString.level3;

import java.util.Scanner;

/**
 * Problem 7 (GCR — Java String Level 3 Assignment)
 * Check whether a text is a palindrome using three different methods:
 * iteration, recursion, and character arrays.
 *
 * Author : Mithun
 * Date : 25-09-2026
 */
public class PalindromeChecker {

    // Check palindrome using start and end indexes
    public static boolean checkPalindromeUsingLoop(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Compare characters from both ends
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    // Check palindrome using recursion
    public static boolean checkPalindromeUsingRecursion(
            String text, int start, int end) {

        // Base case
        if (start >= end) {
            return true;
        }

        // Compare characters
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursive call
        return checkPalindromeUsingRecursion(
                text, start + 1, end - 1);
    }

    // Reverse string using charAt()
    public static char[] reverseUsingCharAt(String text) {
        char[] reverse = new char[text.length()];

        // Store characters in reverse order
        for (int i = 0; i < text.length(); i++) {
            reverse[i] =
                    text.charAt(text.length() - 1 - i);
        }

        return reverse;
    }

    // Check palindrome using character arrays
    public static boolean checkPalindromeUsingArrays(
            String text) {

        // Create original character array
        char[] original = text.toCharArray();

        // Create reversed array
        char[] reverse = reverseUsingCharAt(text);

        // Compare both arrays
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a text: ");
        String text = input.nextLine();

        // Check palindrome using three methods
        boolean loopResult =
                checkPalindromeUsingLoop(text);

        boolean recursiveResult =
                checkPalindromeUsingRecursion(
                        text, 0, text.length() - 1);

        boolean arrayResult =
                checkPalindromeUsingArrays(text);

        // Display results
        System.out.println(
                "Palindrome using loop: " + loopResult);

        System.out.println(
                "Palindrome using recursion: "
                        + recursiveResult);

        System.out.println(
                "Palindrome using arrays: "
                        + arrayResult);

        input.close();
    }
}
