package javaInheritance.singleInheritance;

/**
 * Problem 1: Library Management with Books and Authors
 * Demonstrates single inheritance.
 *
 * Author : Mithun
 * Date : 02-10-2026
 */

class Book {

    String title;
    int publicationYear;

    // Constructor to initialize book details
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Display book information
    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Author extends Book {

    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Display book and author information
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

public class LibraryManagement {

    public static void main(String[] args) {

        // Create subclass object
        Author author = new Author(
                "The Alchemist",
                1988,
                "Paulo Coelho",
                "Brazilian author known for inspirational novels."
        );

        // Display information
        author.displayInfo();
    }
}