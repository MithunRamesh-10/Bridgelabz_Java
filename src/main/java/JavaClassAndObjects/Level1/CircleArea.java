package JavaClassesAndObjects.Level1;

import java.util.Scanner;

/**
 * Problem 2 (GCR — Java Classes and Objects Level 1 Assignment)
 * Program to calculate area and circumference of a circle.
 *
 * Create a Circle class with an attribute radius.
 * Add methods to calculate and display the area and circumference.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */

class Circle {

    double radius;

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display circle details
    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}

public class CircleArea {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Circle circle = new Circle();

        System.out.print("Enter radius: ");
        circle.radius = input.nextDouble();

        System.out.println("\nCircle Details:");
        circle.displayDetails();

        input.close();
    }
}