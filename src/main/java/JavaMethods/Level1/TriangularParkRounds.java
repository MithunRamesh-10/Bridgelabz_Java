package javaMethods.Level1;

import java.util.Scanner;

public class TriangularParkRounds {

    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distance = 5000; // 5 km = 5000 meters

        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 of triangle in meters: ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 of triangle in meters: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 of triangle in meters: ");
        double side3 = sc.nextDouble();

        double rounds = calculateRounds(side1, side2, side3);

        System.out.println("Number of rounds required to complete 5 km: " + rounds);

        sc.close();
    }
}