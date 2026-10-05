package JavaConstructors.StaticThisFinalInstanceof.Level1;

import java.util.Scanner;

/**
 * Problem 4 (GCR — Java Constructors Static, This, Final and Instanceof Assignment)
 * Demonstrate static, this, final and instanceof using a Shopping Cart System.
 *
 * Author : Mithun
 * Date : 03-10-2026
 */

class Product {

    // Static variable
    static double discount = 10.0;

    // Instance variables
    String productName;
    double price;
    int quantity;

    // Final variable
    final int productID;

    // Constructor
    public Product(String productName, double price,
                   int quantity, int productID) {

        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Display product details
    public void displayDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Product ID: " + productID);
        System.out.println("Discount: " + discount + "%");
    }
}

public class ShoppingCartSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String productName = input.nextLine();

        System.out.print("Enter price: ");
        double price = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter product ID: ");
        int productID = input.nextInt();

        Product product = new Product(
                productName,
                price,
                quantity,
                productID
        );

        if (product instanceof Product) {
            System.out.println("\nProduct Details:");
            product.displayDetails();
        }

        System.out.print("\nEnter new discount percentage: ");
        double newDiscount = input.nextDouble();

        Product.updateDiscount(newDiscount);

        System.out.println("\nUpdated Product Details:");
        product.displayDetails();

        input.close();
    }
}