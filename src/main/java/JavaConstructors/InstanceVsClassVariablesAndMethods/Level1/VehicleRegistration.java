package JavaConstructors.InstanceVsClassVariablesAndMethods.Level1;

import java.util.Scanner;

/**
 * Problem 3 (GCR — Instance vs Class Variables and Methods Level 1 Assignment)
 * Create a Vehicle class with instance variables ownerName and vehicleType.
 * Use a class variable registrationFee common to all vehicles.
 *
 * Author : Mithun
 * Date : 03-10-2026
 */

class Vehicle {

    // Instance variables
    String ownerName;
    String vehicleType;

    // Class variable
    static double registrationFee = 5000.0;

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Class method
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

public class VehicleRegistration {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter owner name: ");
        String ownerName = input.nextLine();

        System.out.print("Enter vehicle type: ");
        String vehicleType = input.nextLine();

        Vehicle vehicle = new Vehicle(ownerName, vehicleType);

        System.out.println("\nVehicle Details:");
        vehicle.displayVehicleDetails();

        System.out.print("\nEnter new registration fee: ");
        double newFee = input.nextDouble();

        // Update shared registration fee
        Vehicle.updateRegistrationFee(newFee);

        System.out.println("\nUpdated Vehicle Details:");
        vehicle.displayVehicleDetails();

        input.close();
    }
}