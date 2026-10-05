package JavaClassesAndObjects.Level2;

import java.util.Scanner;

/**
 * Problem 5 (GCR — Java Classes and Objects Level 2 Assignment)
 * Program to simulate a shopping cart.
 *
 * Create a CartItem class with attributes itemName, price,
 * and quantity.
 *
 * Add methods to add an item to the cart, remove an item
 * from the cart, and display the total cost.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */

class CartItem {

    String itemName;
    double price;
    int quantity;

    // Method to add an item
    public void addItem(int quantity) {
        this.quantity += quantity;
    }

    // Method to remove an item
    public void removeItem(int quantity) {

        if (quantity <= this.quantity) {
            this.quantity -= quantity;
        } else {
            System.out.println("Cannot remove more items than available.");
        }
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return price * quantity;
    }

    // Method to display cart details
    public void displayCart() {

        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

public class ShoppingCart {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        CartItem cartItem = new CartItem();

        System.out.print("Enter item name: ");
        cartItem.itemName = input.nextLine();

        System.out.print("Enter item price: ");
        cartItem.price = input.nextDouble();

        System.out.print("Enter quantity: ");
        cartItem.quantity = input.nextInt();

        System.out.println("\nShopping Cart:");
        cartItem.displayCart();

        System.out.print("\nEnter quantity to add: ");
        int addQuantity = input.nextInt();

        cartItem.addItem(addQuantity);

        System.out.println("\nAfter Adding Item:");
        cartItem.displayCart();

        System.out.print("\nEnter quantity to remove: ");
        int removeQuantity = input.nextInt();

        cartItem.removeItem(removeQuantity);

        System.out.println("\nAfter Removing Item:");
        cartItem.displayCart();

        input.close();
    }
}