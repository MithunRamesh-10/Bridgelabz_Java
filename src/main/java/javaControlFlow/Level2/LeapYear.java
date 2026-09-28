package javaControlFlow.level2;

import java.util.Scanner;

/**
 * Problem 1 (GCR — Control Flow Level 2 Assignment)
 * Write a LeapYear program that takes a year as input and outputs
 * the Year is a Leap Year or not a Leap Year.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the year as input
        System.out.print("Enter year: ");
        int year = input.nextInt();

        // Check whether the year is valid for Gregorian calendar
        if (year >= 1582) {

            // Check leap year conditions
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }

        } else {
            System.out.println("Year should be greater than or equal to 1582");
        }

        input.close();
    }
}
