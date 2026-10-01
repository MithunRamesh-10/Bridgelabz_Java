package javaExtras.level1;

import java.util.Scanner;

/**
 * Problem 5 (GCR — Java Extras Level 1 Assignment)
 * Check whether a given string is a palindrome.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class PalindromeChecker {

    // Method to take string input
    public static String getInput(Scanner input) {
        System.out.print("Enter a string: ");
        return input.nextLine();
    }

    // Method to check whether the string is a palindrome
    public static boolean isPalindrome(String text) {

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {

            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // Method to display the result
    public static void displayResult(String text, boolean result) {

        if (result) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input
        String text = getInput(input);

        // Check palindrome
        boolean result = isPalindrome(text);

        // Display result
        displayResult(text, result);

        input.close();
    }
}
