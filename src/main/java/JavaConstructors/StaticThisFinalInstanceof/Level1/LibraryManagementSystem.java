package JavaConstructors.StaticThisFinalInstanceof.Level1;

import java.util.Scanner;

/**
 * Problem 2 (GCR — Java Constructors Static, This, Final and Instanceof Assignment)
 * Demonstrate static, this, final and instanceof using a Library Management System.
 *
 * Author : Mithun
 * Date : 03-10-2026
 */

class Book {

    // Static variable
    static String libraryName = "Central Library";

    // Instance variables
    String title;
    String author;

    // Final variable
    final String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String title = input.nextLine();

        System.out.print("Enter author: ");
        String author = input.nextLine();

        System.out.print("Enter ISBN: ");
        String isbn = input.nextLine();

        Book book = new Book(title, author, isbn);

        Book.displayLibraryName();

        if (book instanceof Book) {
            System.out.println("\nBook Details:");
            book.displayDetails();
        }

        input.close();
    }
}