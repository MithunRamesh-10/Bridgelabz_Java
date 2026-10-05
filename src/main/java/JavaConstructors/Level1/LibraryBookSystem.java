package JavaConstructors.Level1;

import java.util.Scanner;

/**
 * Problem 5 (GCR — Java Constructors Level 1 Assignment)
 * Create a Library Book class with attributes title, author,
 * price, and availability.
 *
 * Implement a method to borrow a book.
 *
 * Author : Mithun
 * Date : 03-10-2026
 */

class LibraryBook {

    String title;
    String author;
    double price;
    boolean availability;

    // Parameterized constructor
    public LibraryBook(String title, String author,
                       double price, boolean availability) {

        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Method to borrow a book
    public void borrowBook() {

        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is currently unavailable.");
        }
    }

    // Method to display book details
    public void displayDetails() {

        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);

        if (availability) {
            System.out.println("Availability: Available");
        } else {
            System.out.println("Availability: Not Available");
        }
    }
}

public class LibraryBookSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String title = input.nextLine();

        System.out.print("Enter author: ");
        String author = input.nextLine();

        System.out.print("Enter price: ");
        double price = input.nextDouble();

        LibraryBook book =
                new LibraryBook(title, author, price, true);

        System.out.println("\nBook Details:");
        book.displayDetails();

        System.out.println("\nBorrowing Book:");
        book.borrowBook();

        System.out.println("\nUpdated Book Details:");
        book.displayDetails();

        input.close();
    }
}