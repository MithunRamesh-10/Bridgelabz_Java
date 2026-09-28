package javaProgrammingElements.level1;

import java.util.Scanner;

/**
 * Problem 15 (GCR — Java Programming Elements Assignment)
 * Take unit price and quantity as input and calculate the total purchase price.
 *
 * Author : Mithun
 * Date : 19-09-2026
 */
public class PurchasePrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the unit price from the user
        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();

        // Take the quantity from the user
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        // Calculate the total purchase price
        double totalPrice = unitPrice * quantity;

        // Display the total purchase price
        System.out.println("The total purchase price is INR " +
                totalPrice + " if the quantity " + quantity +
                " and unit price is INR " + unitPrice);

        input.close();
    }
}
