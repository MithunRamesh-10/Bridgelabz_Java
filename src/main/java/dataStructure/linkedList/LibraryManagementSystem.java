package dataStructure.linkedList;

/**
 * Problem 5: Library Management System
 *
 * Demonstrates doubly linked list operations
 * for managing books in a library.
 *
 * Operations:
 * - Add at beginning
 * - Add at end
 * - Add at specific position
 * - Remove by Book ID
 * - Search by Title
 * - Search by Author
 * - Update availability
 * - Display forward and reverse
 * - Count total books
 *
 * Author : Mithun
 * Date : 08-10-2026
 */
public class LibraryManagementSystem {

    // Node class representing a book
    static class Book {
        private String title;
        private String author;
        private String genre;
        private int bookId;
        private boolean available;

        private Book previous;
        private Book next;

        Book(String title, String author,
             String genre, int bookId,
             boolean available) {

            this.title = title;
            this.author = author;
            this.genre = genre;
            this.bookId = bookId;
            this.available = available;
        }
    }

    private Book head;
    private Book tail;
    private int bookCount;

    // Add at beginning
    public void addAtBeginning(String title,
                               String author,
                               String genre,
                               int bookId,
                               boolean available) {

        Book newBook =
                new Book(
                        title,
                        author,
                        genre,
                        bookId,
                        available
                );

        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.previous = newBook;
            head = newBook;
        }

        bookCount++;
    }

    // Add at end
    public void addAtEnd(String title,
                         String author,
                         String genre,
                         int bookId,
                         boolean available) {

        Book newBook =
                new Book(
                        title,
                        author,
                        genre,
                        bookId,
                        available
                );

        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.previous = tail;
            tail = newBook;
        }

        bookCount++;
    }

    // Add at specific position
    public void addAtPosition(int position,
                              String title,
                              String author,
                              String genre,
                              int bookId,
                              boolean available) {

        if (position <= 1) {
            addAtBeginning(
                    title, author, genre,
                    bookId, available
            );
            return;
        }

        Book current = head;

        for (int i = 1;
             i < position - 1 && current != null;
             i++) {

            current = current.next;
        }

        if (current == null) {
            System.out.println("Invalid position.");
            return;
        }

        if (current == tail) {
            addAtEnd(
                    title, author, genre,
                    bookId, available
            );
            return;
        }

        Book newBook =
                new Book(
                        title, author, genre,
                        bookId, available
                );

        newBook.next = current.next;
        newBook.previous = current;

        current.next.previous = newBook;
        current.next = newBook;

        bookCount++;
    }

    // Remove by Book ID
    public void removeByBookId(int bookId) {

        Book current = head;

        while (current != null) {

            if (current.bookId == bookId) {

                if (current.previous != null) {
                    current.previous.next =
                            current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.previous =
                            current.previous;
                } else {
                    tail = current.previous;
                }

                bookCount--;
                return;
            }

            current = current.next;
        }

        System.out.println("Book not found.");
    }

    // Search by title
    public void searchByTitle(String title) {

        Book current = head;

        while (current != null) {

            if (current.title.equalsIgnoreCase(title)) {
                displayBook(current);
            }

            current = current.next;
        }
    }

    // Search by author
    public void searchByAuthor(String author) {

        Book current = head;

        while (current != null) {

            if (current.author.equalsIgnoreCase(author)) {
                displayBook(current);
            }

            current = current.next;
        }
    }

    // Update availability
    public void updateAvailability(int bookId,
                                   boolean available) {

        Book current = head;

        while (current != null) {

            if (current.bookId == bookId) {
                current.available = available;
                return;
            }

            current = current.next;
        }
    }

    // Forward display
    public void displayForward() {

        Book current = head;

        while (current != null) {
            displayBook(current);
            current = current.next;
        }
    }

    // Reverse display
    public void displayReverse() {

        Book current = tail;

        while (current != null) {
            displayBook(current);
            current = current.previous;
        }
    }

    // Count books
    public int countBooks() {
        return bookCount;
    }

    private void displayBook(Book book) {

        System.out.println(
                "Book ID: " + book.bookId +
                        ", Title: " + book.title +
                        ", Author: " + book.author +
                        ", Genre: " + book.genre +
                        ", Available: " + book.available
        );
    }

    public static void main(String[] args) {

        LibraryManagementSystem library =
                new LibraryManagementSystem();

        library.addAtBeginning(
                "Java Basics",
                "James",
                "Programming",
                101,
                true
        );

        library.addAtEnd(
                "Data Structures",
                "Robert",
                "DSA",
                102,
                true
        );

        library.addAtPosition(
                2,
                "Algorithms",
                "Thomas",
                "DSA",
                103,
                false
        );

        System.out.println("Books Forward:");
        library.displayForward();

        System.out.println("Books Reverse:");
        library.displayReverse();

        System.out.println(
                "Total Books: "
                        + library.countBooks()
        );

        library.updateAvailability(
                101, false
        );

        library.searchByAuthor("James");

        library.removeByBookId(103);
    }
}