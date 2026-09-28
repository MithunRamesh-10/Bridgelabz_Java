package javaProgrammingElements.level2;

import java.util.Scanner;

/**
 * Problem 2 (GCR — Java Programming Elements Assignment)
 * Take integer values a, b and c and perform the specified arithmetic operations.
 *
 * Author : Mithun
 * Date : 19-09-2026
 */
public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take integer values from the user
        System.out.print("Enter a: ");
        int a = input.nextInt();

        System.out.print("Enter b: ");
        int b = input.nextInt();

        System.out.print("Enter c: ");
        int c = input.nextInt();

        // Perform the specified integer operations
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Display all results
        System.out.println("The results of Int Operations are " +
                result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        input.close();
    }
}
