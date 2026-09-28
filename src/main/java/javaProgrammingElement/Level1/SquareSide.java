package javaProgrammingElements.level1;

import java.util.Scanner;

/**
 * Problem 13 (GCR — Java Programming Elements Assignment)
 * Find the side of a square when its perimeter is given.
 *
 * Author : Mithun
 * Date : 19-09-2026
 */
public class SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the perimeter from the user
        System.out.print("Enter perimeter: ");
        double perimeter = input.nextDouble();

        // Calculate the side of the square
        double side = perimeter / 4;

        // Display the side
        System.out.println("The length of the side is " + side +
                " whose perimeter is " + perimeter);

        input.close();
    }
}
