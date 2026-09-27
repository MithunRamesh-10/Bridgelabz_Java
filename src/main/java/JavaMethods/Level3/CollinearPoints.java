
package javaMethods.level3;

import java.util.Scanner;

/**
 * Problem 10 (GCR — Java Methods Level 3 Assignment)
 * Check whether three points are collinear using the
 * slope method and area of triangle method.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class CollinearPoints {

    // Method to check collinearity using slopes
    public static boolean areCollinearUsingSlope(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);

        return slopeAB == slopeBC;
    }

    // Method to check collinearity using triangle area
    public static boolean areCollinearUsingArea(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        double area = 0.5 * Math.abs(
                x1 * (y2 - y3)
                        + x2 * (y3 - y1)
                        + x3 * (y1 - y2)
        );

        return area == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take point A
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();

        // Take point B
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        // Take point C
        System.out.print("Enter x3: ");
        double x3 = input.nextDouble();

        System.out.print("Enter y3: ");
        double y3 = input.nextDouble();

        // Check using both methods
        boolean slopeResult = areCollinearUsingSlope(
                x1, y1, x2, y2, x3, y3);

        boolean areaResult = areCollinearUsingArea(
                x1, y1, x2, y2, x3, y3);

        // Display results
        System.out.println("Using slope method: " + slopeResult);
        System.out.println("Using area method: " + areaResult);

        input.close();
    }
}
