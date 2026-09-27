package javaMethods.level2;

import java.util.Scanner;

/**
 * Problem 5 (GCR — Java Methods Level 2 Assignment)
 * Create a UnitConvertor utility class with static methods
 * to perform yards, feet, meters, inches, and centimeters conversions.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class UnitConverterLength {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take yards input
        System.out.print("Enter yards: ");
        double yards = input.nextDouble();

        // Convert yards to feet
        System.out.println("Feet: " + convertYardsToFeet(yards));

        // Take feet input
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();

        // Convert feet to yards
        System.out.println("Yards: " + convertFeetToYards(feet));

        // Take meters input
        System.out.print("Enter meters: ");
        double meters = input.nextDouble();

        // Convert meters to inches
        System.out.println("Inches: " + convertMetersToInches(meters));

        // Take inches input
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        // Convert inches to meters
        System.out.println("Meters: " + convertInchesToMeters(inches));

        // Take inches input for centimeters
        System.out.print("Enter inches for centimeters: ");
        double inchesForCm = input.nextDouble();

        // Convert inches to centimeters
        System.out.println("Centimeters: " + convertInchesToCm(inchesForCm));

        input.close();
    }
}
