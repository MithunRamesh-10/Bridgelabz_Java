package JavaClassesAndObjects.Level1;

import java.util.Scanner;

/**
 * Problem 4 (GCR — Java Classes and Objects Level 1 Assignment)
 * Program to track inventory of items.
 *
 * Create an Item class with attributes itemCode, itemName, and price.
 * Add methods to display item details and calculate the total cost
 * for a given quantity.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */

class Item {

    int itemCode;
    String itemName;
    double price;

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price);
    }

    // Method to calculate total cost
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class ItemInventory {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Item item = new Item();

        System.out.print("Enter item code: ");
        item.itemCode = input.nextInt();

        input.nextLine();

        System.out.print("Enter item name: ");
        item.itemName = input.nextLine();

        System.out.print("Enter item price: ");
        item.price = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        System.out.println("\nItem Details:");
        item.displayDetails();

        double totalCost = item.calculateTotalCost(quantity);

        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);

        input.close();
    }
}