package JavaClassesAndObjects.Level2;

import java.util.Scanner;

/**
 * Problem 3 (GCR — Java Classes and Objects Level 2 Assignment)
 * Program to check whether a string is a palindrome.
 *
 * Create a PalindromeChecker class with an attribute text.
 * Add methods to check whether the text is a palindrome and
 * display the result.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */

class PalindromeChecker {

    String text;

    // Method to check palindrome
    public boolean isPalindrome() {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {

            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    // Method to display result
    public void displayResult() {

        if (isPalindrome()) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }
}

public class PalindromeString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        PalindromeChecker checker = new PalindromeChecker();

        System.out.print("Enter a string: ");
        checker.text = input.nextLine();

        checker.displayResult();

        input.close();
    }
}