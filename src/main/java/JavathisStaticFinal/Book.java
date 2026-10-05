package javaThisStaticFinal;

/**
 * Problem 2 (GCR — this, static, final keywords and instanceof Operator)
 * Create a Book class using static, this, final and instanceof.
 *
 * Author : Mithun
 * Date : 30-09-2026
 */
public class Book {

    // Static variable shared by all books
    static String libraryName = "Central Library";

    // Instance variables
    String title;
    String author;

    // Final variable cannot be changed after initialization
    final String isbn;

    // Constructor
    Book(String title, String author, String isbn) {

        // this initializes the instance variables
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display library name
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Display book details
    void displayBookDetails() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("ISBN   : " + isbn);
    }

    public static void main(String[] args) {

        // Create Book objects
        Book book1 =
                new Book("Java Programming", "James Gosling",
                        "ISBN101");

        Book book2 =
                new Book("Clean Code", "Robert Martin",
                        "ISBN102");

        // Display common library name
        Book.displayLibraryName();

        System.out.println();

        // Check whether book1 is a Book object
        if (book1 instanceof Book) {
            System.out.println("Book 1 is a Book.");
            book1.displayBookDetails();
        }

        System.out.println();

        // Check whether book2 is a Book object
        if (book2 instanceof Book) {
            System.out.println("Book 2 is a Book.");
            book2.displayBookDetails();
        }
    }
}