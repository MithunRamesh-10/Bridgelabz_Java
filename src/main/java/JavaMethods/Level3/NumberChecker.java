package javaMethods.level3;

import java.util.Scanner;

/**
 * Problem 2 (GCR — Java Methods Level 3 Assignment)
 * Check digit properties of a number including Duck and
 * Armstrong numbers and find largest and smallest digits.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class NumberChecker {

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

    // Method to check Duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }

        return false;
    }

    // Method to check Armstrong number
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int sum = 0;
        int count = digits.length;

        for (int digit : digits) {
            sum += (int) Math.pow(digit, count);
        }

        return sum == number;
    }

    // Method to find largest and second largest digits
    public static int[] findLargestTwo(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        return new int[]{largest, secondLargest};
    }

    // Method to find smallest and second smallest digits
    public static int[] findSmallestTwo(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Get digits
        int[] digits = getDigits(number);

        // Check Duck number
        boolean duck = isDuckNumber(digits);

        // Check Armstrong number
        boolean armstrong = isArmstrongNumber(number, digits);

        // Find largest digits
        int[] largest = findLargestTwo(digits);

        // Find smallest digits
        int[] smallest = findSmallestTwo(digits);

        // Display results
        System.out.println("Duck Number: " + duck);
        System.out.println("Armstrong Number: " + armstrong);
        System.out.println("Largest Digit: " + largest[0]);
        System.out.println("Second Largest Digit: " + largest[1]);
        System.out.println("Smallest Digit: " + smallest[0]);
        System.out.println("Second Smallest Digit: " + smallest[1]);

        input.close();
    }
}
