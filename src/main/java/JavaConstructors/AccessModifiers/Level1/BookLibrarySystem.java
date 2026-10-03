package JavaAccessModifiers.Level1;

import java.util.Scanner;

/**
 * Problem 2 (GCR — Java Access Modifiers Level 1 Assignment)
 * Create a Book class with public, protected, and private members.
 * Demonstrate access to public ISBN and protected title through
 * a subclass while accessing private author through public methods.
 *
 * Author : Mithun
 * Date : 03-10-2026
 */

class Book {

    // Public member
    public String ISBN;

    // Protected member
    protected String title;

    // Private member
    private String author;

    // Public method to set private author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public method to get private author
    public String getAuthor() {
        return author;
    }
}

// Subclass demonstrating protected and public access
class EBook extends Book {

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }
}

public class BookLibrarySystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        EBook book = new EBook();

        System.out.print("Enter ISBN: ");
        book.ISBN = input.nextLine();

        System.out.print("Enter book title: ");
        book.title = input.nextLine();

        System.out.print("Enter author: ");
        String author = input.nextLine();

        book.setAuthor(author);

        System.out.println("\nBook Details:");
        book.displayBookDetails();

        input.close();
    }
}