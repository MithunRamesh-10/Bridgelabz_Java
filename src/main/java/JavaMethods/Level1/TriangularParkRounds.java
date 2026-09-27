package javaMethods.level1;

import java.util.Scanner;

/**
 * Problem 4 (GCR — Java Methods Level 1 Assignment)
 * Calculate the number of rounds an athlete must complete
 * around a triangular park to complete a 5 km run.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class AthleteRounds {

    // Method to calculate number of rounds
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take three sides of triangle
        System.out.print("Enter first side in meters: ");
        double side1 = input.nextDouble();

        System.out.print("Enter second side in meters: ");
        double side2 = input.nextDouble();

        System.out.print("Enter third side in meters: ");
        double side3 = input.nextDouble();

        // Call method to calculate rounds
        double rounds = calculateRounds(side1, side2, side3);

        // Display result
        System.out.println("Number of rounds required: " + rounds);

        input.close();
    }
}
