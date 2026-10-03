package JavaClassAndObjects.Constructors.Level1;

import java.util.Scanner;

/**
 * Problem 4 (GCR — Java Constructors Level 1 Assignment)
 * Hotel Booking System.
 *
 * Author : Mithun
 * Date : 03-10-2026
 */

class Booking {

    String guestName;
    String roomType;
    int nights;

    // Default constructor
    public Booking() {
        guestName = "Unknown";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized constructor
    public Booking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public Booking(Booking booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    public void displayBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }
}

public class HotelBooking {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Booking defaultBooking = new Booking();

        System.out.println("Default Booking:");
        defaultBooking.displayBooking();

        System.out.print("\nEnter guest name: ");
        String guestName = input.nextLine();

        System.out.print("Enter room type: ");
        String roomType = input.nextLine();

        System.out.print("Enter number of nights: ");
        int nights = input.nextInt();

        Booking booking1 =
                new Booking(guestName, roomType, nights);

        System.out.println("\nParameterized Booking:");
        booking1.displayBooking();

        Booking booking2 =
                new Booking(booking1);

        System.out.println("\nCopied Booking:");
        booking2.displayBooking();

        input.close();
    }
}}