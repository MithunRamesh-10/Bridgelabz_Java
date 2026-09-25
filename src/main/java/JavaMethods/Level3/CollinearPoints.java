package javaMethods.Level3;

import java.util.Scanner;

public class CollinearPoints {

    public static boolean areCollinearUsingSlope(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        double slopeAB =
                (y2 - y1) / (x2 - x1);

        double slopeBC =
                (y3 - y2) / (x3 - x2);

        return slopeAB == slopeBC;
    }

    public static double calculateTriangleArea(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        return Math.abs(
                0.5 * (
                        x1 * (y2 - y3) +
                                x2 * (y3 - y1) +
                                x3 * (y1 - y2)
                )
        );
    }

    public static boolean areCollinearUsingArea(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        double area = calculateTriangleArea(
                x1, y1,
                x2, y2,
                x3, y3
        );

        return area == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Point A:");

        System.out.print("x1: ");
        double x1 = sc.nextDouble();

        System.out.print("y1: ");
        double y1 = sc.nextDouble();

        System.out.println("Enter Point B:");

        System.out.print("x2: ");
        double x2 = sc.nextDouble();

        System.out.print("y2: ");
        double y2 = sc.nextDouble();

        System.out.println("Enter Point C:");

        System.out.print("x3: ");
        double x3 = sc.nextDouble();

        System.out.print("y3: ");
        double y3 = sc.nextDouble();

        double area = calculateTriangleArea(
                x1, y1,
                x2, y2,
                x3, y3
        );

        System.out.println(
                "\nArea of Triangle: " + area
        );

        System.out.println(
                "Collinear using Area: " +
                        areCollinearUsingArea(
                                x1, y1,
                                x2, y2,
                                x3, y3
                        )
        );

        // Slope method only when denominators are non-zero
        if (x1 != x2 && x2 != x3) {

            System.out.println(
                    "Collinear using Slope: " +
                            areCollinearUsingSlope(
                                    x1, y1,
                                    x2, y2,
                                    x3, y3
                            )
            );
        }

        sc.close();
    }
}
