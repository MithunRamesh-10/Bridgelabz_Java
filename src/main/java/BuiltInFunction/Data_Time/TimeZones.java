package javaBuiltInFunctions.level1;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Problem 2 (GCR — Java BuiltInFunctions Level 1 Assignment)
 * Display the current time in different time zones:
 * GMT, IST, and PST.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class TimeZones {

    // Method to display current time in different time zones
    public static void displayTimeZones() {

        ZonedDateTime gmtTime =
                ZonedDateTime.now(ZoneId.of("GMT"));

        ZonedDateTime istTime =
                ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        ZonedDateTime pstTime =
                ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        // Display time in different time zones
        System.out.println("GMT Time: " + gmtTime);
        System.out.println("IST Time: " + istTime);
        System.out.println("PST Time: " + pstTime);
    }

    public static void main(String[] args) {

        // Call method
        displayTimeZones();
    }
}
