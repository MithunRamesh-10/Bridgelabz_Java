package javaMethods.level2;

import java.util.Scanner;

/**
 * Problem 3 (GCR — Java Methods Level 2 Assignment)
 * Check whether a given year is a Leap Year using a method.
 * The program works for years from 1582 onwards.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class LeapYear {

    // Method to check whether the year is a leap year
    public static boolean isLeapYear(int year) {

        // Check Gregorian calendar starting year
        if (year < 1582) {
            return false;
        }

        // Check leap year conditions
        return (year % 400 == 0) ||
                (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take year input
        System.out.print("Enter year: ");
        int year = input.nextInt();

        // Check leap year
        boolean leapYear = isLeapYear(year);

        // Display result
        if (year < 1582) {
            System.out.println("Year should be 1582 or later.");
        } else if (leapYear) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }

        input.close();
    }
}
