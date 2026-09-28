package javaProgrammingElements.level1;

import java.util.Scanner;

/**
 * Problem 10 (GCR — Java Programming Elements Assignment)
 * Take height in centimeters and convert it into feet and inches.
 *
 * Author : Mithun
 * Date : 19-09-2026
 */
public class HeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take height in centimeters from the user
        System.out.print("Enter height in centimeters: ");
        double height = input.nextDouble();

        // Convert centimeters to inches
        double inches = height / 2.54;

        // Convert inches to feet
        double feet = inches / 12;

        // Display the converted height
        System.out.println("Your Height in cm is " + height +
                " while in feet is " + feet +
                " and inches is " + inches);

        input.close();
    }
}
