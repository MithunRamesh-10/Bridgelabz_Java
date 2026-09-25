package javaMethods.Level3;

import java.util.Scanner;

public class NumberReversePalindrome {

    public static int countDigits(int number) {

        number = Math.abs(number);

        if (number == 0) {
            return 1;
        }

        int count = 0;

        while (number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    public static int[] storeDigits(int number) {

        number = Math.abs(number);

        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }

    public static int[] reverseArray(int[] digits) {

        int[] reversed = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }

        return reversed;
    }

    public static boolean areArraysEqual(int[] first, int[] second) {

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

    public static boolean isPalindrome(int[] digits) {

        int[] reversed = reverseArray(digits);

        return areArraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {

        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = storeDigits(number);
        int[] reversed = reverseArray(digits);

        System.out.print("Digits: ");

        for (int digit : digits) {
            System.out.print(digit + " ");
        }

        System.out.print("\nReversed: ");

        for (int digit : reversed) {
            System.out.print(digit + " ");
        }

        System.out.println();

        System.out.println("Arrays Equal: " +
                areArraysEqual(digits, reversed));

        System.out.println("Palindrome: " +
                isPalindrome(digits));

        System.out.println("Duck Number: " +
                isDuckNumber(digits));

        sc.close();
    }
}
