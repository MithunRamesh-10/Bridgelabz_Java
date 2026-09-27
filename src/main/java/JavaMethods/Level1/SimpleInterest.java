package javaMethods.level1;

import java.util.Scanner;

/**
 * Problem 1 (GCR — Java Methods Level 1 Assignment)
 * Calculate Simple Interest using Principal, Rate, and Time.
 * The calculation is performed using a separate method.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class SimpleInterest {

    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take principal input
        System.out.print("Enter principal: ");
        double principal = input.nextDouble();

        // Take rate input
        System.out.print("Enter rate of interest: ");
        double rate = input.nextDouble();

        // Take time input
        System.out.print("Enter time: ");
        double time = input.nextDouble();

        // Call method to calculate simple interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Display result
        System.out.println("The Simple Interest is " + simpleInterest +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);

        input.close();
    }
}
