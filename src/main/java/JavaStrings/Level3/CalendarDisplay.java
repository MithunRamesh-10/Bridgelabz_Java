package javaString.level3;

import java.util.Scanner;

/**
 * Problem 9 (GCR — Java String Level 3 Assignment)
 * Create a program to display a calendar for a given month
 * and year using the Gregorian calendar algorithm.
 *
 * Author : Mithun
 * Date : 25-09-2026
 */
public class Calendar {

    // Store names of all months
    private static final String[] MONTHS = {
            "January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December"
    };

    // Store number of days in each month
    private static final int[] DAYS = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    // Check whether a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0)
                || (year % 4 == 0 && year % 100 != 0);
    }

    // Get the name of the month
    public static String getMonthName(int month) {
        return MONTHS[month - 1];
    }

    // Get number of days in the month
    public static int getNumberOfDays(
            int month, int year) {

        // February has 29 days in a leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return DAYS[month - 1];
    }

    // Get first day of the month using Gregorian algorithm
    public static int getFirstDay(
            int month, int year) {

        int day = 1;

        int y0 =
                year - (14 - month) / 12;

        int x =
                y0 + y0 / 4 - y0 / 100 + y0 / 400;

        int m0 =
                month + 12 * ((14 - month) / 12) - 2;

        return (day + x + (31 * m0) / 12) % 7;
    }

    // Display the calendar
    public static void displayCalendar(
            int month, int year) {

        String monthName = getMonthName(month);
        int numberOfDays =
                getNumberOfDays(month, year);

        int firstDay =
                getFirstDay(month, year);

        // Display month and year
        System.out.println(
                monthName + " " + year);

        // Display weekdays
        System.out.println(
                "Sun Mon Tue Wed Thu Fri Sat");

        // First loop creates indentation
        for (int i = 0; i < firstDay; i++) {
            System.out.printf("%3s", "");
        }

        // Second loop displays days
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d", day);

            // Move to next line after Saturday
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take month and year
        System.out.print("Enter month: ");
        int month = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        // Display calendar
        displayCalendar(month, year);

        input.close();
    }
}
