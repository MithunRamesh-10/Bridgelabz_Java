package javaAbstraction;

import java.util.ArrayList;

/**
 * Problem 6: Online Food Delivery System
 *
 * Demonstrates abstraction, encapsulation, interfaces
 * and polymorphism in an online food delivery system.
 *
 * Author : Mithun
 * Date : 03-10-2026
 */
public class OnlineFoodDeliverySystem {

    // Interface for discount-related behavior
    interface Discountable {
        double applyDiscount();

        String getDiscountDetails();
    }

    // Abstract FoodItem class
    static abstract class FoodItem {
        private String itemName;
        private double price;
        private int quantity;

        FoodItem(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }

        // Getter methods
        public String getItemName() {
            return itemName;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        // Setter methods
        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        // Abstract total-price calculation
        public abstract double calculateTotalPrice();

        // Concrete method
        public void getItemDetails() {
            System.out.println("Item: " + itemName);
            System.out.println("Price: ₹" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println(
                    "Total Price: ₹" + calculateTotalPrice()
            );
        }
    }

    // Vegetarian item
    static class VegItem extends FoodItem implements Discountable {

        VegItem(String itemName, double price, int quantity) {
            super(itemName, price, quantity);
        }

        @Override
        public double calculateTotalPrice() {
            return getPrice() * getQuantity();
        }

        @Override
        public double applyDiscount() {
            return calculateTotalPrice() * 0.10;
        }

        @Override
        public String getDiscountDetails() {
            return "Vegetarian item discount: 10%";
        }
    }

    // Non-vegetarian item
    static class NonVegItem extends FoodItem implements Discountable {

        NonVegItem(String itemName, double price, int quantity) {
            super(itemName, price, quantity);
        }

        @Override
        public double calculateTotalPrice() {
            return (getPrice() * getQuantity()) + 50;
        }

        @Override
        public double applyDiscount() {
            return calculateTotalPrice() * 0.05;
        }

        @Override
        public String getDiscountDetails() {
            return "Non-vegetarian item discount: 5%";
        }
    }

    public static void main(String[] args) {

        // Create food items using FoodItem references
        FoodItem vegItem =
                new VegItem("Paneer Biryani", 250, 2);

        FoodItem nonVegItem =
                new NonVegItem("Chicken Biryani", 300, 2);

        // Store items in one list
        ArrayList<FoodItem> foodItems = new ArrayList<>();
        foodItems.add(vegItem);
        foodItems.add(nonVegItem);

        // Runtime polymorphism
        for (FoodItem item : foodItems) {
            item.getItemDetails();

            Discountable discountable = (Discountable) item;

            System.out.println(
                    "Discount: ₹" + discountable.applyDiscount()
            );

            System.out.println(
                    discountable.getDiscountDetails()
            );

            System.out.println();
        }
    }
}