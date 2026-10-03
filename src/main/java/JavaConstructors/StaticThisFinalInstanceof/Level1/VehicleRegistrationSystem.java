package JavaConstructors.StaticThisFinalInstanceof.Level1;

import java.util.Scanner;

/**
 * Problem 6 (GCR — Java Constructors Static, This, Final and Instanceof Assignment)
 * Demonstrate static, this, final and instanceof using Vehicle Registration.
 *
 * Author : Mithun
 * Date : 03-10-2026
 */

class Vehicle {

    // Static variable
    static double registrationFee = 5000.0;

    // Instance variables
    String ownerName;
    String vehicleType;

    // Final variable
    final String registrationNumber;

    // Constructor
    public Vehicle(String ownerName, String vehicleType,
                   String registrationNumber) {

        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Display vehicle details
    public void displayDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
    }
}

public class VehicleRegistrationSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter owner name: ");
        String ownerName = input.nextLine();

        System.out.print("Enter vehicle type: ");
        String vehicleType = input.nextLine();

        System.out.print("Enter registration number: ");
        String registrationNumber = input.nextLine();

        Vehicle vehicle = new Vehicle(
                ownerName,
                vehicleType,
                registrationNumber
        );

        if (vehicle instanceof Vehicle) {
            System.out.println("\nVehicle Details:");
            vehicle.displayDetails();
        }

        System.out.print("\nEnter new registration fee: ");
        double newFee = input.nextDouble();

        Vehicle.updateRegistrationFee(newFee);

        System.out.println("\nUpdated Vehicle Details:");
        vehicle.displayDetails();

        input.close();
    }
}