package JavaClassesAndObjects.Level1;

import java.util.Scanner;

/**
 * Problem 3 (GCR — Java Classes and Objects Level 1 Assignment)
 * Program to handle book details.
 *
 * Create a Book class with attributes title, author, and price.
 * Add a method to display the book details.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */

class Book {

    String title;
    String author;
    double price;

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: " + price);
    }
}

public class BookDetails {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Book book = new Book();

        System.out.print("Enter book title: ");
        book.title = input.nextLine();

        System.out.print("Enter book author: ");
        book.author = input.nextLine();

        System.out.print("Enter book price: ");
        book.price = input.nextDouble();

        System.out.println("\nBook Details:");
        book.displayDetails();

        input.close();
    }
}