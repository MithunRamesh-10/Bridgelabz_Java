package JavaConstructors.Level1;

import java.util.Scanner;

/**
 * Problem 6 (GCR — Java Constructors Level 1 Assignment)
 * Create a CarRental class with attributes customerName,
 * carModel, and rentalDays.
 *
 * Add constructors to initialize rental details and
 * calculate total cost.
 *
 * Author : Mithun
 * Date : 03-10-2026
 */

class Rental {

    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay;

    // Default constructor
    public Rental() {
        customerName = "Unknown";
        carModel = "Unknown";
        rentalDays = 0;
        costPerDay = 0.0;
    }

    // Parameterized constructor
    public Rental(String customerName, String carModel,
                  int rentalDays, double costPerDay) {

        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    // Method to display rental details
    public void displayDetails() {

        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Cost Per Day: " + costPerDay);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

public class CarRental {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = input.nextLine();

        System.out.print("Enter car model: ");
        String carModel = input.nextLine();

        System.out.print("Enter rental days: ");
        int rentalDays = input.nextInt();

        System.out.print("Enter cost per day: ");
        double costPerDay = input.nextDouble();

        Rental rental =
                new Rental(
                        customerName,
                        carModel,
                        rentalDays,
                        costPerDay
                );

        System.out.println("\nCar Rental Details:");
        rental.displayDetails();

        input.close();
    }
}