package JavaStrings.Extras;

import java.util.Scanner;

/**
 * Problem 2 (GCR — Java Strings Level 1 Assignment)
 * Reverse a given string without using built-in reverse functions.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class ReverseString {

    // Method to reverse a string
    public static String reverseString(String text) {

        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Call method
        String result = reverseString(text);

        // Display result
        System.out.println("Reversed String: " + result);

        input.close();
    }
}
