package javaMethods.Level1;

import java.util.Scanner;

public class QuadraticEquation {

    public static double[] findRoots(double a, double b, double c) {

        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta > 0) {

            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);

            return new double[]{root1, root2};

        } else if (delta == 0) {

            double root = -b / (2 * a);

            return new double[]{root};

        } else {

            return new double[0];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("This is not a quadratic equation.");
            sc.close();
            return;
        }

        double[] roots = findRoots(a, b, c);

        if (roots.length == 2) {

            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);

        } else if (roots.length == 1) {

            System.out.println("Only one root exists: " + roots[0]);

        } else {

            System.out.println("No real roots exist.");
        }

        sc.close();
    }
}