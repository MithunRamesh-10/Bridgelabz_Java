package JavaConstructors.Level1;

import java.util.Scanner;

/**
 * Problem 2 (GCR — Java Constructors Level 1 Assignment)
 * Create a Circle class with a radius attribute.
 * Use constructor chaining to initialize radius with
 * default and user-provided values.
 *
 * Author : Mithun
 * Date : 03-10-2026
 */

class Circle {

    double radius;

    // Default constructor
    public Circle() {
        this(1.0);
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to display radius and area
    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }
}

public class CircleConstructorChaining {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Object using default constructor
        Circle defaultCircle = new Circle();

        System.out.println("Default Circle:");
        defaultCircle.displayDetails();

        System.out.print("\nEnter radius: ");
        double radius = input.nextDouble();

        // Object using parameterized constructor
        Circle userCircle = new Circle(radius);

        System.out.println("\nUser Circle:");
        userCircle.displayDetails();

        input.close();
    }
}