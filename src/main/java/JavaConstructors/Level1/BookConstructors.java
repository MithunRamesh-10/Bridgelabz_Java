package JavaConstructors.Level1;

import java.util.Scanner;

/**
 * Problem 1 (GCR — Java Constructors Level 1 Assignment)
 * Create a Book class with attributes title, author, and price.
 * Provide both default and parameterized constructors.
 *
 * Author : Mithun
 * Date : 03-10-2026
 */

class Book {

    String title;
    String author;
    double price;

    // Default constructor
    public Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class BookConstructors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Object using default constructor
        Book defaultBook = new Book();

        System.out.println("Default Book:");
        defaultBook.displayDetails();

        // Taking input for parameterized constructor
        System.out.print("\nEnter book title: ");
        String title = input.nextLine();

        System.out.print("Enter author: ");
        String author = input.nextLine();

        System.out.print("Enter price: ");
        double price = input.nextDouble();

        // Object using parameterized constructor
        Book parameterizedBook = new Book(title, author, price);

        System.out.println("\nParameterized Book:");
        parameterizedBook.displayDetails();

        input.close();
    }
}