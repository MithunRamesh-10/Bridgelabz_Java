package javaProgrammingElements.level2;

import java.util.Scanner;

/**
 * Problem 3 (GCR — Java Programming Elements Assignment)
 * Take double values a, b and c and perform the specified arithmetic operations.
 *
 * Author : Mithun
 * Date : 19-09-2026
 */
public class DoubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take double values from the user
        System.out.print("Enter a: ");
        double a = input.nextDouble();

        System.out.print("Enter b: ");
        double b = input.nextDouble();

        System.out.print("Enter c: ");
        double c = input.nextDouble();

        // Perform the specified double operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Display all results
        System.out.println("The results of Double Operations are " +
                result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        input.close();
    }
}
