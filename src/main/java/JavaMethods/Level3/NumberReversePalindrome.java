package javaMethods.level3;

import java.util.Scanner;

/**
 * Problem 4 (GCR — Java Methods Level 3 Assignment)
 * Reverse the digits of a number, compare digit arrays,
 * and check whether the number is a palindrome or Duck number.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class PalindromeDuckNumber {

    // Method to count digits
    public static int countDigits(int number) {
        int count = 0;
        int temp = number;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        return count;
    }

    // Method to store digits in an array
    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        int temp = number;

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        return digits;
    }

    // Method to reverse a digit array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }

        return reversed;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] first, int[] second) {

        if (first.length != second.length) {
            return false;
        }

        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }

        return true;
    }

    // Method to check palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);

        return compareArrays(digits, reversed);
    }

    // Method to check Duck number
    public static boolean isDuckNumber(int[] digits) {

        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Get digits
        int[] digits = getDigits(number);

        // Check palindrome and Duck number
        boolean palindrome = isPalindrome(digits);
        boolean duck = isDuckNumber(digits);

        // Display results
        System.out.println("Palindrome Number: " + palindrome);
        System.out.println("Duck Number: " + duck);

        input.close();
    }
}
