package javaProgrammingElements.level1;

import java.util.Scanner;

/**
 * Problem 14 (GCR — Java Programming Elements Assignment)
 * Convert a distance given in feet into yards and miles.
 *
 * Author : Mithun
 * Date : 19-09-2026
 */
public class FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take distance in feet from the user
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Convert feet to yards
        double yards = distanceInFeet / 3;

        // Convert yards to miles
        double miles = yards / 1760;

        // Display the converted distance
        System.out.println("The distance in feet is " + distanceInFeet +
                ", in yards is " + yards +
                " and in miles is " + miles);

        input.close();
    }
}
