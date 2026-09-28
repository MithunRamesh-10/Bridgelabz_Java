package javaString.level1;

import java.util.Scanner;

/**
 * Problem 1 (GCR — Java String Level 1 Assignment)
 * Write a program to compare two strings using the charAt() method
 * and check the result with the built-in String equals() method.
 *
 * Author : Mithun
 * Date : 25-09-2026
 */
public class CompareStrings {

    // Compare two strings character by character using charAt()
    public static boolean compareUsingCharAt(String first, String second) {
        // Check if the lengths are different
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

        // Take two string inputs
        System.out.print("Enter first string: ");
        String first = input.next();

        System.out.print("Enter second string: ");
        String second = input.next();

        // Compare using user-defined method
        boolean userDefinedResult = compareUsingCharAt(first, second);

        // Compare using built-in equals() method
        boolean builtInResult = first.equals(second);

        // Display both results
        System.out.println("Comparison using charAt(): " + userDefinedResult);
        System.out.println("Comparison using equals(): " + builtInResult);

        // Check whether both results are the same
        System.out.println("Both results are same: "
                + (userDefinedResult == builtInResult));

        input.close();
    }
}
