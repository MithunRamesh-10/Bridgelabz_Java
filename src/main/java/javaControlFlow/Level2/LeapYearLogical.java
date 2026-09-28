package javaControlFlow.level2;

import java.util.Scanner;

/**
 * Problem 2 (GCR — Control Flow Level 2 Assignment)
 * Rewrite program 1 to determine Leap Year with single if condition
 * using logical AND && and OR || operators.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class LeapYearSingleCondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the year as input
        System.out.print("Enter year: ");
        int year = input.nextInt();

        // Check leap year using a single if condition
        if (year >= 1582 && (year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }

        input.close();
    }
}
