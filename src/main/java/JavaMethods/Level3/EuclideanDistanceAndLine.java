package javaMethods.Level3;

import java.util.Scanner;

public class EuclideanDistanceAndLine {

    public static double findDistance(
            double x1,
            double y1,
            double x2,
            double y2) {

        return Math.sqrt(
                Math.pow(x2 - x1, 2) +
                        Math.pow(y2 - y1, 2)
        );
    }

    public static double[] findLineEquation(
            double x1,
            double y1,
            double x2,
            double y2) {

        double slope = (y2 - y1) / (x2 - x1);

        double intercept = y1 - slope * x1;

        return new double[]{slope, intercept};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double distance = findDistance(x1, y1, x2, y2);

        System.out.println(
                "Euclidean Distance: " + distance
        );

        if (x1 == x2) {

            System.out.println(
                    "Equation of line: x = " + x1
            );

        } else {

            double[] equation =
                    findLineEquation(x1, y1, x2, y2);

            double slope = equation[0];
            double intercept = equation[1];

            System.out.println("Slope: " + slope);
            System.out.println("Y-Intercept: " + intercept);

            System.out.println(
                    "Equation: y = " +
                            slope + "x + " +
                            intercept
            );
        }

        sc.close();
    }
}
