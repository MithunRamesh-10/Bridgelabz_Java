package javaSearchingAlgorithms.stringBuilder;

/**
 * Problem 1 (Reverse a String Using StringBuilder)
 * Write a program that uses StringBuilder to reverse a given string.
 *
 * Author : Mithun
 * Date : 09-10-2026
 */

public class ReverseString {

    public static String reverseString(String input) {

        // Create a StringBuilder and append the input
        StringBuilder result = new StringBuilder();
        result.append(input);

        // Reverse the string and convert it back to String
        return result.reverse().toString();
    }

    public static void main(String[] args) {

        String input = "hello";

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reverseString(input));
    }
}