package dataStructure.linkedList;

/**
 * Problem 9: Online Ticket Reservation System
 *
 * Demonstrates circular linked list operations
 * for managing movie ticket reservations.
 *
 * Operations:
 * - Add ticket at end
 * - Remove ticket by Ticket ID
 * - Display tickets
 * - Search by Customer Name
 * - Search by Movie Name
 * - Count total booked tickets
 *
 * Author : Mithun
 * Date : 08-10-2026
 */
public class TicketReservationSystem {

    // Node representing a booked ticket
    static class Ticket {
        private int ticketId;
        private String customerName;
        private String movieName;
        private String seatNumber;
        private String bookingTime;

        private Ticket next;

        Ticket(int ticketId,
               String customerName,
               String movieName,
               String seatNumber,
               String bookingTime) {

            this.ticketId = ticketId;
            this.customerName = customerName;
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.bookingTime = bookingTime;
        }
    }

    private Ticket head;
    private Ticket tail;

    // Add ticket at end
    public void addTicket(int ticketId,
                          String customerName,
                          String movieName,
                          String seatNumber,
                          String bookingTime) {

        Ticket newTicket =
                new Ticket(
                        ticketId,
                        customerName,
                        movieName,
                        seatNumber,
                        bookingTime
                );

        if (head == null) {

            head = tail = newTicket;
            tail.next = head;

            return;
        }

        tail.next = newTicket;
        tail = newTicket;

        tail.next = head;
    }

    // Remove ticket by Ticket ID
    public void removeTicket(int ticketId) {

        if (head == null) {
            System.out.println(
                    "No tickets available."
            );
            return;
        }

        // Only one ticket
        if (head == tail
                && head.ticketId == ticketId) {

            head = tail = null;
            return;
        }

        // Remove head
        if (head.ticketId == ticketId) {

            head = head.next;
            tail.next = head;

            return;
        }

        Ticket previous = head;
        Ticket current = head.next;

        while (current != head) {

            if (current.ticketId == ticketId) {

                previous.next =
                        current.next;

                if (current == tail) {
                    tail = previous;
                }

                tail.next = head;

                return;
            }

            previous = current;
            current = current.next;
        }

        System.out.println(
                "Ticket not found."
        );
    }

    // Display all tickets
    public void display() {

        if (head == null) {

            System.out.println(
                    "No tickets booked."
            );

            return;
        }

        Ticket current = head;

        do {

            displayTicket(current);
            current = current.next;

        } while (current != head);
    }

    // Search by Customer Name
    public void searchByCustomer(String customerName) {

        if (head == null) {
            return;
        }

        Ticket current = head;

        do {

            if (current.customerName
                    .equalsIgnoreCase(customerName)) {

                displayTicket(current);
            }

            current = current.next;

        } while (current != head);
    }

    // Search by Movie Name
    public void searchByMovie(String movieName) {

        if (head == null) {
            return;
        }

        Ticket current = head;

        do {

            if (current.movieName
                    .equalsIgnoreCase(movieName)) {

                displayTicket(current);
            }

            current = current.next;

        } while (current != head);
    }

    // Count total booked tickets
    public int countTickets() {

        if (head == null) {
            return 0;
        }

        int count = 0;
        Ticket current = head;

        do {

            count++;
            current = current.next;

        } while (current != head);

        return count;
    }

    private void displayTicket(Ticket ticket) {

        System.out.println(
                "Ticket ID: " + ticket.ticketId +
                        ", Customer: " + ticket.customerName +
                        ", Movie: " + ticket.movieName +
                        ", Seat: " + ticket.seatNumber +
                        ", Booking Time: " + ticket.bookingTime
        );
    }

    public static void main(String[] args) {

        TicketReservationSystem system =
                new TicketReservationSystem();

        system.addTicket(
                101,
                "Mithun",
                "Leo",
                "A1",
                "10:00 AM"
        );

        system.addTicket(
                102,
                "Rahul",
                "Leo",
                "A2",
                "10:05 AM"
        );

        system.addTicket(
                103,
                "Arun",
                "Avatar",
                "B1",
                "10:10 AM"
        );

        System.out.println("All Tickets:");
        system.display();

        System.out.println(
                "\nTotal Tickets: "
                        + system.countTickets()
        );

        System.out.println(
                "\nTickets for Leo:"
        );

        system.searchByMovie("Leo");

        System.out.println(
                "\nTickets booked by Mithun:"
        );

        system.searchByCustomer("Mithun");

        system.removeTicket(102);

        System.out.println(
                "\nAfter Ticket Removal:"
        );

        system.display();
    }
}