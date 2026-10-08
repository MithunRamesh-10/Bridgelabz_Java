package dataStructure.linkedList;

/**
 * Problem 2: Movie Management System
 *
 * Demonstrates doubly linked list operations
 * for managing movie records.
 *
 * Operations:
 * - Add at beginning
 * - Add at end
 * - Add at specific position
 * - Remove by Movie Title
 * - Search by Director
 * - Search by Rating
 * - Display forward
 * - Display reverse
 * - Update movie rating
 *
 * Author : Mithun
 * Date : 08-10-2026
 */
public class MovieManagementSystem {

    // Node class representing a movie
    static class Movie {
        private String title;
        private String director;
        private int yearOfRelease;
        private double rating;

        private Movie previous;
        private Movie next;

        Movie(String title, String director,
              int yearOfRelease, double rating) {

            this.title = title;
            this.director = director;
            this.yearOfRelease = yearOfRelease;
            this.rating = rating;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }
    }

    private Movie head;
    private Movie tail;

    // Add at beginning
    public void addAtBeginning(String title,
                               String director,
                               int year,
                               double rating) {

        Movie newMovie =
                new Movie(title, director, year, rating);

        if (head == null) {
            head = tail = newMovie;
            return;
        }

        newMovie.next = head;
        head.previous = newMovie;
        head = newMovie;
    }

    // Add at end
    public void addAtEnd(String title,
                         String director,
                         int year,
                         double rating) {

        Movie newMovie =
                new Movie(title, director, year, rating);

        if (tail == null) {
            head = tail = newMovie;
            return;
        }

        tail.next = newMovie;
        newMovie.previous = tail;
        tail = newMovie;
    }

    // Add at specific position
    public void addAtPosition(int position,
                              String title,
                              String director,
                              int year,
                              double rating) {

        if (position <= 1) {
            addAtBeginning(
                    title, director, year, rating
            );
            return;
        }

        Movie current = head;

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
                    title, director, year, rating
            );
            return;
        }

        Movie newMovie =
                new Movie(title, director, year, rating);

        newMovie.next = current.next;
        newMovie.previous = current;

        current.next.previous = newMovie;
        current.next = newMovie;
    }

    // Remove by Movie Title
    public void removeByTitle(String title) {

        Movie current = head;

        while (current != null) {

            if (current.title.equalsIgnoreCase(title)) {

                if (current.previous != null) {
                    current.previous.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.previous =
                            current.previous;
                } else {
                    tail = current.previous;
                }

                return;
            }

            current = current.next;
        }

        System.out.println("Movie not found.");
    }

    // Search by Director
    public void searchByDirector(String director) {

        Movie current = head;

        while (current != null) {

            if (current.director.equalsIgnoreCase(director)) {
                displayMovie(current);
            }

            current = current.next;
        }
    }

    // Search by Rating
    public void searchByRating(double rating) {

        Movie current = head;

        while (current != null) {

            if (current.rating == rating) {
                displayMovie(current);
            }

            current = current.next;
        }
    }

    // Update rating
    public void updateRating(String title,
                             double newRating) {

        Movie current = head;

        while (current != null) {

            if (current.title.equalsIgnoreCase(title)) {
                current.setRating(newRating);
                return;
            }

            current = current.next;
        }

        System.out.println("Movie not found.");
    }

    // Forward display
    public void displayForward() {

        Movie current = head;

        while (current != null) {
            displayMovie(current);
            current = current.next;
        }
    }

    // Reverse display
    public void displayReverse() {

        Movie current = tail;

        while (current != null) {
            displayMovie(current);
            current = current.previous;
        }
    }

    private void displayMovie(Movie movie) {

        System.out.println(
                "Title: " + movie.title +
                        ", Director: " + movie.director +
                        ", Year: " + movie.yearOfRelease +
                        ", Rating: " + movie.rating
        );
    }

    public static void main(String[] args) {

        MovieManagementSystem movies =
                new MovieManagementSystem();

        movies.addAtBeginning(
                "Avatar", "James Cameron", 2009, 7.8
        );

        movies.addAtEnd(
                "Inception", "Christopher Nolan", 2010, 8.8
        );

        movies.addAtEnd(
                "Interstellar", "Christopher Nolan", 2014, 8.7
        );

        movies.addAtPosition(
                2, "Titanic", "James Cameron",
                1997, 7.9
        );

        System.out.println("Forward Display:");
        movies.displayForward();

        System.out.println("Reverse Display:");
        movies.displayReverse();

        System.out.println("Search by Director:");
        movies.searchByDirector("Christopher Nolan");

        movies.updateRating("Avatar", 8.0);

        movies.removeByTitle("Titanic");
    }
}