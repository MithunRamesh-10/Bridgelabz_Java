package javaControlFlow.level3;

/**
 * Problem 5 (GCR — Control Flow Level 3 Assignment)
 * Write a program DayOfWeek that takes month, day, and year from
 * the command line and calculates the day of the week.
 * The output is 0 for Sunday, 1 for Monday, 2 for Tuesday, and so on.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class DayOfWeek {

    public static void main(String[] args) {

        // Take month, day, and year from command line
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);

        // Calculate adjusted year
        int y0 = year - (14 - month) / 12;

        // Calculate year value
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Calculate adjusted month
        int m0 = month + 12 * ((14 - month) / 12) - 2;

        // Calculate day of the week
        int d0 = (day + x + (31 * m0) / 12) % 7;

        // Display the day number
        System.out.println("Day of week: " + d0);
    }
}
