package javaExtras.level1;

import java.util.Scanner;

/**
 * Problem 8 (GCR — Java Extras Level 1 Assignment)
 * Convert temperatures between Fahrenheit and Celsius.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class TemperatureConverter {

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {

        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {

        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take Fahrenheit input
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = fahrenheitToCelsius(fahrenheit);

        // Display result
        System.out.println(
                "Temperature in Celsius: " + celsius
        );

        // Take Celsius input
        System.out.print("Enter temperature in Celsius: ");
        double celsiusInput = input.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheitResult =
                celsiusToFahrenheit(celsiusInput);

        // Display result
        System.out.println(
                "Temperature in Fahrenheit: " + fahrenheitResult
        );

        input.close();
    }
}
