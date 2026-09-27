package javaMethods.level2;

import java.util.Scanner;

/**
 * Problem 6 (GCR — Java Methods Level 2 Assignment)
 * Create a UnitConvertor utility class with static methods
 * for temperature, weight, and volume conversions.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class UnitConverterTemperature {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take Fahrenheit input
        System.out.print("Enter Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius
        System.out.println("Celsius: "
                + convertFahrenheitToCelsius(fahrenheit));

        // Take Celsius input
        System.out.print("Enter Celsius: ");
        double celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit
        System.out.println("Fahrenheit: "
                + convertCelsiusToFahrenheit(celsius));

        // Take pounds input
        System.out.print("Enter pounds: ");
        double pounds = input.nextDouble();

        // Convert pounds to kilograms
        System.out.println("Kilograms: "
                + convertPoundsToKilograms(pounds));

        // Take kilograms input
        System.out.print("Enter kilograms: ");
        double kilograms = input.nextDouble();

        // Convert kilograms to pounds
        System.out.println("Pounds: "
                + convertKilogramsToPounds(kilograms));

        // Take gallons input
        System.out.print("Enter gallons: ");
        double gallons = input.nextDouble();

        // Convert gallons to liters
        System.out.println("Liters: "
                + convertGallonsToLiters(gallons));

        // Take liters input
        System.out.print("Enter liters: ");
        double liters = input.nextDouble();

        // Convert liters to gallons
        System.out.println("Gallons: "
                + convertLitersToGallons(liters));

        input.close();
    }
}
