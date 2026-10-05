package JavaClassesAndObjects.Level1;

import java.util.Scanner;

/**
 * Problem 5 (GCR — Java Classes and Objects Level 1 Assignment)
 * Program to handle mobile phone details.
 *
 * Create a MobilePhone class with attributes brand, model, and price.
 * Add a method to display all the details of the phone.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */

class MobilePhone {

    String brand;
    String model;
    double price;

    // Method to display mobile phone details
    public void displayDetails() {
        System.out.println("Phone Brand: " + brand);
        System.out.println("Phone Model: " + model);
        System.out.println("Phone Price: " + price);
    }
}

public class MobilePhoneDetails {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        MobilePhone phone = new MobilePhone();

        System.out.print("Enter phone brand: ");
        phone.brand = input.nextLine();

        System.out.print("Enter phone model: ");
        phone.model = input.nextLine();

        System.out.print("Enter phone price: ");
        phone.price = input.nextDouble();

        System.out.println("\nMobile Phone Details:");
        phone.displayDetails();

        input.close();
    }
}