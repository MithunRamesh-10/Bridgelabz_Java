package javaMethods.level3;

import java.util.Scanner;

/**
 * Problem 8 (GCR — Java Methods Level 3 Assignment)
 * Display the calendar for a given month and year using
 * the Gregorian calendar algorithm.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class Calendar {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        return months[month - 1];
    }

    // Method to check leap year
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0);
    }

    // Method to get number of days in a month
    public static int getDaysInMonth(int month, int year) {
        int[] days = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        // February has 29 days in a leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return days[month - 1];
    }

    // Method to find first day of the month
    public static int getFirstDay(int month, int year) {

        int day = 1;

        // Gregorian calendar algorithm
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;

        return (day + x + (31 * m0) / 12) % 7;
    }

    // Method to display calendar
    public static void displayCalendar(int month, int year) {

        int firstDay = getFirstDay(month, year);
        int numberOfDays = getDaysInMonth(month, year);

        // Display month and year
        System.out.println("\n     "
                + getMonthName(month) + " " + year);

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Add indentation for first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Display days
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day);

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

        // Validate month
        if (month < 1 || month > 12) {
            System.out.println("Invalid month.");
        } else {
            displayCalendar(month, year);
        }

        input.close();
    }
}
