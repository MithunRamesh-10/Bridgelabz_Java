package JavaConstructors.InstanceVsClassVariablesAndMethods.Level1;

import java.util.Scanner;

/**
 * Problem 1 (GCR — Instance vs Class Variables and Methods Level 1 Assignment)
 * Create a Product class with instance variables productName and price.
 * Use a class variable totalProducts to count all products created.
 *
 * Author : Mithun
 * Date : 03-10-2026
 */

class Product {

    // Instance variables
    String productName;
    double price;

    // Class variable
    static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;

        // Increase total product count
        totalProducts++;
    }

    // Instance method
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

public class ProductInventory {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first product name: ");
        String productName1 = input.nextLine();

        System.out.print("Enter first product price: ");
        double price1 = input.nextDouble();

        input.nextLine();

        Product product1 = new Product(productName1, price1);

        System.out.print("\nEnter second product name: ");
        String productName2 = input.nextLine();

        System.out.print("Enter second product price: ");
        double price2 = input.nextDouble();

        Product product2 = new Product(productName2, price2);

        System.out.println("\nProduct 1 Details:");
        product1.displayProductDetails();

        System.out.println("\nProduct 2 Details:");
        product2.displayProductDetails();

        System.out.println();
        Product.displayTotalProducts();

        input.close();
    }
}