package JavaStrings.Extras;

import java.util.Scanner;

/**
 * Problem 3 (GCR — Java Strings Level 1 Assignment)
 * Check whether a given string is a palindrome.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class PalindromeStringCheck {

    // Method to check whether a string is palindrome
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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Call method
        boolean result = isPalindrome(text);

        // Display result
        if (result) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        input.close();
    }
}