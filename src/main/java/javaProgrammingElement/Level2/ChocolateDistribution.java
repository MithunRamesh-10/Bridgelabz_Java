package javaProgrammingElements.level2;

import java.util.Scanner;

/**
 * Problem 10 (GCR — Java Programming Elements Assignment)
 * Create a program to divide N number of chocolates among M children.
 *
 * Author : Mithun
 * Date : 19-09-2026
 */
public class DivideChocolates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the number of chocolates
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        // Take the number of children
        System.out.print("Enter number of children: ");
        int numberOfChildren = input.nextInt();

        // Calculate chocolates received by each child
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;

        // Calculate remaining chocolates
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Display the result
        System.out.println("The number of chocolates each child gets is "
                + chocolatesPerChild +
                " and the number of remaining chocolates are "
                + remainingChocolates);

        input.close();
    }
}
