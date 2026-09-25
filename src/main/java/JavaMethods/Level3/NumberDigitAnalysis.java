package javaMethods.Level3;

import java.util.Scanner;

public class NumberDigitAnalysis {

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

    public static int findSum(int[] digits) {

        int sum = 0;

        for (int digit : digits) {
            sum += digit;
        }

        return sum;
    }

    public static int findSumOfSquares(int[] digits) {

        int sum = 0;

        for (int digit : digits) {
            sum += (int) Math.pow(digit, 2);
        }

        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {

        int sum = findSum(digits);

        return sum != 0 && number % sum == 0;
    }

    public static int[][] findDigitFrequency(int[] digits) {

        int[][] frequency = new int[10][2];

        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }

        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = storeDigits(number);

        System.out.println("Sum of digits: " + findSum(digits));

        System.out.println(
                "Sum of squares of digits: " +
                        findSumOfSquares(digits)
        );

        System.out.println(
                "Harshad Number: " +
                        isHarshadNumber(Math.abs(number), digits)
        );

        int[][] frequency = findDigitFrequency(digits);

        System.out.println("\nDigit Frequency:");

        for (int i = 0; i < 10; i++) {

            if (frequency[i][1] > 0) {
                System.out.println(
                        frequency[i][0] +
                                " -> " +
                                frequency[i][1]
                );
            }
        }

        sc.close();
    }
}
