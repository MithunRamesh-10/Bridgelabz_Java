package javaProgrammingElement;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in centimeters: ");
        double baseCm = input.nextDouble();

        System.out.print("Enter height in centimeters: ");
        double heightCm = input.nextDouble();

        double areaCm = 0.5 * baseCm * heightCm;

        double baseInches = baseCm / 2.54;
        double heightInches = heightCm / 2.54;

        double areaInches = 0.5 * baseInches * heightInches;

        System.out.println("The area of triangle is " + areaCm +
                " square centimeters and " + areaInches +
                " square inches");

        input.close();
    }
}
