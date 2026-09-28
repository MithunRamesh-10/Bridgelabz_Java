package javaProgrammingElements.level1;

import java.util.Scanner;

/**
 * Problem 8 (GCR — Java Programming Elements Assignment)
 * Take distance in kilometers as user input and convert it to miles.
 *
 * Author : Mithun
 * Date : 19-09-2026
 */
public class KmToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take distance in kilometers from the user
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        // Convert kilometers to miles
        double miles = km / 1.6;

        // Display the converted distance
        System.out.println("The total miles is " + miles +
                " mile for the given " + km + " km");

        input.close();
    }
}
