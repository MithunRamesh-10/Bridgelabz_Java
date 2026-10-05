package javaObjectModeling;

import java.util.ArrayList;

/**
 * Problem 7: E-commerce Platform with Orders, Customers, and Products
 *
 * Demonstrates association between Customer and Order
 * and aggregation between Order and Product.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class EcommercePlatform {

    static class Product {
        String productName;
        double price;

        Product(String productName, double price) {
            this.productName = productName;
            this.price = price;
        }

        void displayProduct() {
            System.out.println(
                    "- " + productName + " : ₹" + price
            );
        }
    }

    static class Order {
        int orderId;
        ArrayList<Product> products = new ArrayList<>();

        Order(int orderId) {
            this.orderId = orderId;
        }

        void addProduct(Product product) {
            products.add(product);
        }

        void displayOrder() {
            System.out.println("Order ID: " + orderId);
            System.out.println("Products:");

            for (Product product : products) {
                product.displayProduct();
            }
        }
    }

    static class Customer {
        String customerName;
        ArrayList<Order> orders = new ArrayList<>();

        Customer(String customerName) {
            this.customerName = customerName;
        }

        void placeOrder(Order order) {
            orders.add(order);

            System.out.println(
                    customerName + " placed Order " + order.orderId
            );
        }

        void displayOrders() {
            System.out.println("Customer: " + customerName);

            for (Order order : orders) {
                order.displayOrder();
            }
        }
    }

    public static void main(String[] args) {

        // Create products
        Product laptop = new Product("Laptop", 60000);
        Product mouse = new Product("Mouse", 1000);
        Product keyboard = new Product("Keyboard", 2000);

        // Create order
        Order order = new Order(101);

        // Add products to order
        order.addProduct(laptop);
        order.addProduct(mouse);
        order.addProduct(keyboard);

        // Create customer
        Customer customer = new Customer("Hemang");

        // Customer places order
        customer.placeOrder(order);

        // Display order details
        System.out.println();
        customer.displayOrders();
    }
}