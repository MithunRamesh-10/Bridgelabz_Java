package javaAbstraction;

import java.util.ArrayList;

/**
 * Problem 2: E-Commerce Platform
 *
 * Demonstrates abstraction, encapsulation, interfaces
 * and polymorphism in an e-commerce system.
 *
 * Author : Mithun
 * Date : 03-10-2026
 */
public class ECommercePlatform {

    // Interface for taxable products
    interface Taxable {
        double calculateTax();

        String getTaxDetails();
    }

    // Abstract Product class
    static abstract class Product {
        private int productId;
        private String name;
        private double price;

        Product(int productId, String name, double price) {
            this.productId = productId;
            this.name = name;
            this.price = price;
        }

        // Getter methods
        public int getProductId() {
            return productId;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        // Setter methods
        public void setProductId(int productId) {
            this.productId = productId;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        // Abstract discount calculation
        public abstract double calculateDiscount();

        // Calculate final price
        public double calculateFinalPrice() {
            double discount = calculateDiscount();
            double tax = 0;

            if (this instanceof Taxable) {
                Taxable taxable = (Taxable) this;
                tax = taxable.calculateTax();
            }

            return price + tax - discount;
        }

        public void displayDetails() {
            System.out.println("Product ID: " + productId);
            System.out.println("Name: " + name);
            System.out.println("Price: ₹" + price);
            System.out.println("Discount: ₹" + calculateDiscount());
            System.out.println("Final Price: ₹" + calculateFinalPrice());
        }
    }

    // Electronics product
    static class Electronics extends Product implements Taxable {

        Electronics(int productId, String name, double price) {
            super(productId, name, price);
        }

        @Override
        public double calculateDiscount() {
            return getPrice() * 0.10;
        }

        @Override
        public double calculateTax() {
            return getPrice() * 0.18;
        }

        @Override
        public String getTaxDetails() {
            return "Electronics tax: 18%";
        }
    }

    // Clothing product
    static class Clothing extends Product implements Taxable {

        Clothing(int productId, String name, double price) {
            super(productId, name, price);
        }

        @Override
        public double calculateDiscount() {
            return getPrice() * 0.20;
        }

        @Override
        public double calculateTax() {
            return getPrice() * 0.05;
        }

        @Override
        public String getTaxDetails() {
            return "Clothing tax: 5%";
        }
    }

    // Grocery product
    static class Groceries extends Product implements Taxable {

        Groceries(int productId, String name, double price) {
            super(productId, name, price);
        }

        @Override
        public double calculateDiscount() {
            return getPrice() * 0.05;
        }

        @Override
        public double calculateTax() {
            return getPrice() * 0.02;
        }

        @Override
        public String getTaxDetails() {
            return "Grocery tax: 2%";
        }
    }

    public static void main(String[] args) {

        // Create products using Product references
        Product laptop =
                new Electronics(101, "Laptop", 60000);

        Product shirt =
                new Clothing(102, "Shirt", 2000);

        Product rice =
                new Groceries(103, "Rice", 1000);

        // Store products in one list
        ArrayList<Product> products = new ArrayList<>();
        products.add(laptop);
        products.add(shirt);
        products.add(rice);

        // Runtime polymorphism
        for (Product product : products) {
            product.displayDetails();

            Taxable taxable = (Taxable) product;
            System.out.println(taxable.getTaxDetails());

            System.out.println();
        }
    }
}