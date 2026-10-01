package javaBuiltInFunctions.level1;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Problem 4 (GCR — Java BuiltInFunctions Level 1 Assignment)
 * Take two date inputs and compare them to check whether
 * the first date is before, after, or the same as the second date.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class DateComparison {

    // Method to compare two dates
    public static String compareDates(
            LocalDate firstDate,
            LocalDate secondDate) {

        if (firstDate.isBefore(secondDate)) {
            return "First date is before the second date.";
        } else if (firstDate.isAfter(secondDate)) {
            return "First date is after the second date.";
        } else if (firstDate.isEqual(secondDate)) {
            return "Both dates are the same.";
        }

        return "Invalid comparison.";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take first date
        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate firstDate = LocalDate.parse(input.next());

        // Take second date
        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate secondDate = LocalDate.parse(input.next());

        // Call method
        String result = compareDates(firstDate, secondDate);

        // Display result
        System.out.println(result);

        input.close();
    }
}