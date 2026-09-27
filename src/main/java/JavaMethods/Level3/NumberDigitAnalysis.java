package javaMethods.level3;

import java.util.Scanner;

/**
 * Problem 3 (GCR — Java Methods Level 3 Assignment)
 * Find digit sum, sum of squares, check Harshad number,
 * and find the frequency of each digit.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class NumberDigitProperties {

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

    // Method to find sum of digits
    public static int findDigitSum(int[] digits) {
        int sum = 0;

        for (int digit : digits) {
            sum += digit;
        }

        return sum;
    }

    // Method to find sum of squares of digits
    public static double findSquareSum(int[] digits) {
        double sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }

        return sum;
    }

    // Method to check Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = findDigitSum(digits);

        return number % sum == 0;
    }

    // Method to find frequency of each digit
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];

        // Store digits from 0 to 9
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }

        // Count frequency
        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Get digits
        int[] digits = getDigits(number);

        // Calculate results
        int sum = findDigitSum(digits);
        double squareSum = findSquareSum(digits);
        boolean harshad = isHarshadNumber(number, digits);
        int[][] frequency = findDigitFrequency(digits);

        // Display results
        System.out.println("Sum of digits: " + sum);
        System.out.println("Sum of squares: " + squareSum);
        System.out.println("Harshad Number: " + harshad);

        System.out.println("Digit Frequency:");

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(
                        frequency[i][0] + " -> " + frequency[i][1]);
            }
        }

        input.close();
    }
}
