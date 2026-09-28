package javaProgrammingElements.level1;

import java.util.Scanner;

/**
 * Problem 12 (GCR — Java Programming Elements Assignment)
 * Calculate the area of a triangle using base and height.
 *
 * Author : Mithun
 * Date : 19-09-2026
 */
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the base from the user
        System.out.print("Enter base: ");
        double base = input.nextDouble();

        // Take the height from the user
        System.out.print("Enter height: ");
        double height = input.nextDouble();

        // Calculate the area of the triangle
        double area = 0.5 * base * height;

        // Display the area
        System.out.println("The area of the triangle is " + area);

        input.close();
    }
}
