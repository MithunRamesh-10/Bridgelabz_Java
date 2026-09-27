package javaMethods.level2;

import java.util.Scanner;

/**
 * Problem 11 (GCR — Java Methods Level 2 Assignment)
 * Find the roots of a quadratic equation using
 * Math.pow() and Math.sqrt().
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class Quadratic {

    // Method to find roots of quadratic equation
    public static double[] findRoots(double a, double b, double c) {

        // Calculate discriminant
        double delta = Math.pow(b, 2) - (4 * a * c);

        // No real roots
        if (delta < 0) {
            return new double[0];
        }

        // One root when delta is zero
        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }

        // Two roots when delta is positive
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);

        return new double[]{root1, root2};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take a, b and c
        System.out.print("Enter a: ");
        double a = input.nextDouble();

        System.out.print("Enter b: ");
        double b = input.nextDouble();

        System.out.print("Enter c: ");
        double c = input.nextDouble();

        // Check whether a is zero
        if (a == 0) {
            System.out.println("This is not a quadratic equation.");
            input.close();
            return;
        }

        // Find roots
        double[] roots = findRoots(a, b, c);

        // Display roots
        if (roots.length == 0) {
            System.out.println("No real roots.");
        } else if (roots.length == 1) {
            System.out.println("Root: " + roots[0]);
        } else {
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        }

        input.close();
    }
}
