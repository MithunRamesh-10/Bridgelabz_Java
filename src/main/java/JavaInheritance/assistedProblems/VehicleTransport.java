package javaInheritance.assistedProblems;

/**
 * Problem 3: Vehicle and Transport System
 * Demonstrates inheritance and polymorphism using a Vehicle array.
 *
 * Author : Mithun
 * Date : 02-10-2026
 */

class Vehicle {

    int maxSpeed;
    String fuelType;

    // Constructor to initialize vehicle details
    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Display common vehicle information
    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {

    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    // Override displayInfo for Car
    @Override
    void displayInfo() {
        System.out.println("Car");
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {

    double loadCapacity;

    Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    // Override displayInfo for Truck
    @Override
    void displayInfo() {
        System.out.println("Truck");
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

class Motorcycle extends Vehicle {

    boolean hasGear;

    Motorcycle(int maxSpeed, String fuelType, boolean hasGear) {
        super(maxSpeed, fuelType);
        this.hasGear = hasGear;
    }

    // Override displayInfo for Motorcycle
    @Override
    void displayInfo() {
        System.out.println("Motorcycle");
        super.displayInfo();
        System.out.println("Has Gear: " + hasGear);
    }
}

public class VehicleTransport {

    public static void main(String[] args) {

        // Store different subclass objects in a Vehicle array
        Vehicle[] vehicles = {
                new Car(180, "Petrol", 5),
                new Truck(120, "Diesel", 10),
                new Motorcycle(150, "Petrol", true)
        };

        // Call overridden methods using polymorphism
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }
    }
}