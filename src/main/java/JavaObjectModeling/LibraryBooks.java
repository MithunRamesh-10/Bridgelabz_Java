package javaObjectModeling;

import java.util.ArrayList;

/**
 * Problem 1: Library and Books - Aggregation
 *
 * Demonstrates an aggregation relationship where a Library
 * contains multiple Book objects, but Book objects can exist
 * independently of a Library.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class LibraryBooks {

    static class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        void displayBook() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }

    static class Library {
        String libraryName;
        ArrayList<Book> books = new ArrayList<>();

        Library(String libraryName) {
            this.libraryName = libraryName;
        }

        void addBook(Book book) {
            books.add(book);
        }

        void displayBooks() {
            System.out.println("Library: " + libraryName);

            for (Book book : books) {
                book.displayBook();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        // Create Book objects independently
        Book book1 = new Book("Java Programming", "James Gosling");
        Book book2 = new Book("Clean Code", "Robert Martin");
        Book book3 = new Book("Database Systems", "Abraham Silberschatz");

        // Create two Library objects
        Library library1 = new Library("Central Library");
        Library library2 = new Library("Computer Science Library");

        // Add books to different libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book3);

        // Display library details
        library1.displayBooks();
        library2.displayBooks();
    }
}