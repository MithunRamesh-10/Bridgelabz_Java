package javaBuiltInFunctions.level1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Problem 3 (GCR — Java BuiltInFunctions Level 1 Assignment)
 * Display the current date in three different formats:
 * dd/MM/yyyy
 * yyyy-MM-dd
 * EEE, MMM dd, yyyy
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class DateFormatting {

    // Method to display current date in different formats
    public static void displayDateFormats(LocalDate date) {

        // Create date formatters
        DateTimeFormatter format1 =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter format2 =
                DateTimeFormatter.ofPattern("yyyy-MM-dd");

        DateTimeFormatter format3 =
                DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Display formatted dates
        System.out.println("Format 1: " + date.format(format1));
        System.out.println("Format 2: " + date.format(format2));
        System.out.println("Format 3: " + date.format(format3));
    }

    public static void main(String[] args) {

        // Get current date
        LocalDate currentDate = LocalDate.now();

        // Call method
        displayDateFormats(currentDate);
    }
}
