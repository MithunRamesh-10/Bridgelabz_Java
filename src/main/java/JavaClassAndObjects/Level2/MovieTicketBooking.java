package JavaClassesAndObjects.Level2;

import java.util.Scanner;

/**
 * Problem 4 (GCR — Java Classes and Objects Level 2 Assignment)
 * Program to model a movie ticket booking system.
 *
 * Create a MovieTicket class with attributes movieName,
 * seatNumber, and price.
 *
 * Add methods to book a ticket by assigning a seat and updating
 * the price, and to display ticket details.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */

class MovieTicket {

    String movieName;
    String seatNumber;
    double price;

    // Method to book a ticket
    public void bookTicket(String seatNumber, double price) {

        this.seatNumber = seatNumber;
        this.price = price;

        System.out.println("Ticket booked successfully.");
    }

    // Method to display ticket details
    public void displayTicketDetails() {

        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: " + price);
    }
}

public class MovieTicketBooking {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        MovieTicket ticket = new MovieTicket();

        System.out.print("Enter movie name: ");
        ticket.movieName = input.nextLine();

        System.out.print("Enter seat number: ");
        String seatNumber = input.nextLine();

        System.out.print("Enter ticket price: ");
        double price = input.nextDouble();

        ticket.bookTicket(seatNumber, price);

        System.out.println("\nTicket Details:");
        ticket.displayTicketDetails();

        input.close();
    }
}