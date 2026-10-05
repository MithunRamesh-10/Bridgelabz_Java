package javaAbstraction;

import java.util.ArrayList;

/**
 * Problem 5: Library Management System
 *
 * Demonstrates abstraction, encapsulation, interfaces
 * and polymorphism in a library management system.
 *
 * Author : Mithun
 * Date : 03-10-2026
 */
public class LibraryManagementSystem {

    // Interface for reservable library items
    interface Reservable {
        void reserveItem();

        boolean checkAvailability();
    }

    // Abstract LibraryItem class
    static abstract class LibraryItem {
        private int itemId;
        private String title;
        private String author;

        LibraryItem(int itemId, String title, String author) {
            this.itemId = itemId;
            this.title = title;
            this.author = author;
        }

        // Getter methods
        public int getItemId() {
            return itemId;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        // Setter methods
        public void setItemId(int itemId) {
            this.itemId = itemId;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        // Abstract loan duration
        public abstract int getLoanDuration();

        // Concrete method
        public void getItemDetails() {
            System.out.println("Item ID: " + itemId);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println(
                    "Loan Duration: " + getLoanDuration() + " days"
            );
        }
    }

    // Book
    static class Book extends LibraryItem implements Reservable {
        private boolean available = true;

        Book(int itemId, String title, String author) {
            super(itemId, title, author);
        }

        @Override
        public int getLoanDuration() {
            return 21;
        }

        @Override
        public void reserveItem() {
            if (available) {
                available = false;
                System.out.println("Book reserved successfully.");
            } else {
                System.out.println("Book is already reserved.");
            }
        }

        @Override
        public boolean checkAvailability() {
            return available;
        }
    }

    // Magazine
    static class Magazine extends LibraryItem implements Reservable {
        private boolean available = true;

        Magazine(int itemId, String title, String author) {
            super(itemId, title, author);
        }

        @Override
        public int getLoanDuration() {
            return 7;
        }

        @Override
        public void reserveItem() {
            if (available) {
                available = false;
                System.out.println("Magazine reserved successfully.");
            } else {
                System.out.println("Magazine is already reserved.");
            }
        }

        @Override
        public boolean checkAvailability() {
            return available;
        }
    }

    // DVD
    static class DVD extends LibraryItem implements Reservable {
        private boolean available = true;

        DVD(int itemId, String title, String author) {
            super(itemId, title, author);
        }

        @Override
        public int getLoanDuration() {
            return 5;
        }

        @Override
        public void reserveItem() {
            if (available) {
                available = false;
                System.out.println("DVD reserved successfully.");
            } else {
                System.out.println("DVD is already reserved.");
            }
        }

        @Override
        public boolean checkAvailability() {
            return available;
        }
    }

    public static void main(String[] args) {

        // Create different library items
        LibraryItem book =
                new Book(101, "Java Programming", "James Gosling");

        LibraryItem magazine =
                new Magazine(102, "Tech Today", "Tech Publications");

        LibraryItem dvd =
                new DVD(103, "Java Tutorial", "Programming Academy");

        // Store items using LibraryItem references
        ArrayList<LibraryItem> items = new ArrayList<>();
        items.add(book);
        items.add(magazine);
        items.add(dvd);

        // Runtime polymorphism
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println();
        }

        // Reserve a book
        Reservable reservableBook = (Reservable) book;
        reservableBook.reserveItem();

        System.out.println(
                "Book Available: "
                        + reservableBook.checkAvailability()
        );
    }
}