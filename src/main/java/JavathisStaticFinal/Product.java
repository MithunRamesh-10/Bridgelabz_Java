package javaThisStaticFinal;

/**
 * Problem 4 (GCR — this, static, final keywords and instanceof Operator)
 * Create a Product class using static, this, final and instanceof.
 *
 * Author : Mithun
 * Date : 30-09-2026
 */
public class Product {

    // Static variable shared by all products
    static double discount = 10.0;

    // Instance variables
    String productName;
    double price;
    int quantity;

    // Final product ID cannot be changed
    final int productID;

    // Constructor
    Product(String productName, double price,
            int quantity, int productID) {

        // this initializes instance variables
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method to update discount
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Display product details
    void displayProductDetails() {
        System.out.println("Product ID   : " + productID);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Discount     : " + discount + "%");
    }

    public static void main(String[] args) {

        // Create Product object
        Product product =
                new Product("Laptop", 50000, 2, 101);

        // Check object type
        if (product instanceof Product) {
            System.out.println("Object is a Product.");
            product.displayProductDetails();
        }

        // Update common discount
        Product.updateDiscount(15.0);

        System.out.println("\nAfter Updating Discount:");

        product.displayProductDetails();
    }
}