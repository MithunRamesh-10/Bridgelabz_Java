package javaMethods.level1;

import java.util.Scanner;

/**
 * Problem 12 (GCR — Java Methods Level 1 Assignment)
 * Calculate sine, cosine, and tangent for an angle given in degrees.
 * Convert the angle to radians before using the Math class functions.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class TrigonometricFunctions {

    // Method to calculate trigonometric functions
    public double[] calculateTrigonometricFunctions(double angle) {

        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return all three results
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take angle input
        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();

        // Create object to call non-static method
        TrigonometricFunctions calculator = new TrigonometricFunctions();

        // Call method
        double[] result = calculator.calculateTrigonometricFunctions(angle);

        // Display results
        System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);

        input.close();
    }
}
