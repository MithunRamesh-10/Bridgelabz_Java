package javaString.level1;

import java.util.Scanner;

/**
 * Problem 2 (GCR — Java String Level 1 Assignment)
 * Write a program to create a substring from a String using charAt()
 * and compare it with the built-in substring() method.
 *
 * Author : Mithun
 * Date : 25-09-2026
 */
public class CreateSubstring {

    // Create substring manually using charAt()
    public static String createSubstring(
            String text, int start, int end) {

        String result = "";

        // Add characters from start index to end index
        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    // Compare two strings using charAt()
    public static boolean compareStrings(String first, String second) {
        // Check if lengths are different
        if (first.length() != second.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take string and index inputs
        System.out.print("Enter a string: ");
        String text = input.next();

        System.out.print("Enter start index: ");
        int start = input.nextInt();

        System.out.print("Enter end index: ");
        int end = input.nextInt();

        // Create substring using charAt()
        String userDefinedSubstring =
                createSubstring(text, start, end);

        // Create substring using built-in substring()
        String builtInSubstring = text.substring(start, end);

        // Compare both substrings
        boolean result =
                compareStrings(userDefinedSubstring, builtInSubstring);

        // Display results
        System.out.println("Substring using charAt(): "
                + userDefinedSubstring);
        System.out.println("Substring using substring(): "
                + builtInSubstring);
        System.out.println("Both results are same: " + result);

        input.close();
    }
}
