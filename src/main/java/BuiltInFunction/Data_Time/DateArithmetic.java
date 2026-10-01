package javaMethods.level1;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Problem 1 (GCR — Java BuiltInFunctions Level 1 Assignment)
 * Add 7 days, 1 month, and 2 years to a given date.
 * Then subtract 3 weeks from the result.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class DateArithmetic {

    // Method to perform date arithmetic
    public static LocalDate calculateDate(LocalDate date) {

        LocalDate result = date.plusDays(7);
        result = result.plusMonths(1);
        result = result.plusYears(2);
        result = result.minusWeeks(3);

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take date input
        System.out.print("Enter date (yyyy-MM-dd): ");
        LocalDate date = LocalDate.parse(input.next());

        // Call method
        LocalDate result = calculateDate(date);

        // Display result
        System.out.println("Final date: " + result);

        input.close();
    }
}