package javaInheritance.hybridInheritance;

/**
 * Problem 2: Vehicle Management System
 * Demonstrates hybrid inheritance using inheritance and interface.
 *
 * Author : Mithun
 * Date : 02-10-2026
 */

class Vehicle {

    int maxSpeed;
    String model;

    // Constructor to initialize vehicle details
    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // Display common vehicle details
    void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

interface Refuelable {

    // Define refueling behavior
    void refuel();
}

class ElectricVehicle extends Vehicle {

    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    // Charge the electric vehicle
    void charge() {
        System.out.println("Electric vehicle is charging.");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    // Refuel the petrol vehicle
    @Override
    public void refuel() {
        System.out.println("Petrol vehicle is being refueled.");
    }
}

public class VehicleManagement {

    public static void main(String[] args) {

        // Create ElectricVehicle object
        ElectricVehicle electricVehicle = new ElectricVehicle(160, "Tesla Model 3");

        // Create PetrolVehicle object
        PetrolVehicle petrolVehicle = new PetrolVehicle(180, "Honda City");

        // Display electric vehicle details
        electricVehicle.displayInfo();
        electricVehicle.charge();

        System.out.println();

        // Display petrol vehicle details
        petrolVehicle.displayInfo();
        petrolVehicle.refuel();
    }
}