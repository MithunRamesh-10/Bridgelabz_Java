package javaThisStaticFinal;

/**
 * Problem 6 (GCR — this, static, final keywords and instanceof Operator)
 * Create a Vehicle class using static, this, final and instanceof.
 *
 * Author : Mithun
 * Date : 30-09-2026
 */
public class Vehicle {

    // Static variable common to all vehicles
    static double registrationFee = 5000.0;

    // Instance variables
    String ownerName;
    String vehicleType;

    // Final registration number cannot be changed
    final String registrationNumber;

    // Constructor
    Vehicle(String ownerName, String vehicleType,
            String registrationNumber) {

        // this initializes instance variables
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update registration fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Display vehicle details
    void displayVehicleDetails() {
        System.out.println("Owner Name         : " + ownerName);
        System.out.println("Vehicle Type       : " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee   : " + registrationFee);
    }

    public static void main(String[] args) {

        // Create Vehicle object
        Vehicle vehicle =
                new Vehicle("Hemang", "Car", "TN01AB1234");

        // Check object type
        if (vehicle instanceof Vehicle) {
            System.out.println("Object is a Vehicle.");
            vehicle.displayVehicleDetails();
        }

        // Update common registration fee
        Vehicle.updateRegistrationFee(7500.0);

        System.out.println("\nAfter Updating Registration Fee:");

        vehicle.displayVehicleDetails();
    }
}