package javaMethods.level2;

import java.util.Scanner;

/**
 * Problem 4 (GCR — Java Methods Level 2 Assignment)
 * Create a UnitConvertor utility class with static methods
 * to perform different length unit conversions.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class UnitConverter {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input in kilometers
        System.out.print("Enter kilometers: ");
        double km = input.nextDouble();

        // Convert kilometers to miles
        System.out.println("Miles: " + convertKmToMiles(km));

        // Take input in miles
        System.out.print("Enter miles: ");
        double miles = input.nextDouble();

        // Convert miles to kilometers
        System.out.println("Kilometers: " + convertMilesToKm(miles));

        // Take input in meters
        System.out.print("Enter meters: ");
        double meters = input.nextDouble();

        // Convert meters to feet
        System.out.println("Feet: " + convertMetersToFeet(meters));

        // Take input in feet
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();

        // Convert feet to meters
        System.out.println("Meters: " + convertFeetToMeters(feet));

        input.close();
    }
}
