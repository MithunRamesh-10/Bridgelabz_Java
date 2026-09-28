package javaProgrammingElements.level2;

import java.util.Scanner;

/**
 * Problem 12 (GCR — Java Programming Elements Assignment)
 * Create a program to convert weight in pounds to kilograms.
 *
 * Author : Mithun
 * Date : 19-09-2026
 */
public class PoundsToKilograms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // Convert pounds to kilograms
        double weightInKg = weight / 2.2;

        // Display the converted weight
        System.out.println("The weight of the person in pound is "
                + weight + " and in kg is " + weightInKg);

        input.close();
    }
}
