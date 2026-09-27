package javaMethods.level1;

import java.util.Scanner;

/**
 * Problem 11 (GCR — Java Methods Level 1 Assignment)
 * Calculate the wind chill temperature using the given temperature
 * and wind speed values.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class WindChill {

    // Method to calculate wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74
                + (0.6215 * temperature)
                + ((0.4275 * temperature - 35.75)
                * Math.pow(windSpeed, 0.16));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take temperature input
        System.out.print("Enter temperature: ");
        double temperature = input.nextDouble();

        // Take wind speed input
        System.out.print("Enter wind speed: ");
        double windSpeed = input.nextDouble();

        // Create object to call non-static method
        WindChill windChillCalculator = new WindChill();

        // Call method to calculate wind chill
        double windChill = windChillCalculator.calculateWindChill(
                temperature, windSpeed);

        // Display result
        System.out.println("Wind Chill Temperature: " + windChill);

        input.close();
    }
}
