package javaAbstraction;

import java.util.ArrayList;

/**
 * Problem 3: Vehicle Rental System
 *
 * Demonstrates abstraction, encapsulation, interfaces
 * and polymorphism in a vehicle rental system.
 *
 * Author : Mithun
 * Date : 03-10-2026
 */
public class VehicleRentalSystem {

    // Interface for insurance behavior
    interface Insurable {
        double calculateInsurance();

        String getInsuranceDetails();
    }

    // Abstract Vehicle class
    static abstract class Vehicle {
        private String vehicleNumber;
        private String type;
        private double rentalRate;

        Vehicle(String vehicleNumber, String type, double rentalRate) {
            this.vehicleNumber = vehicleNumber;
            this.type = type;
            this.rentalRate = rentalRate;
        }

        // Getter methods
        public String getVehicleNumber() {
            return vehicleNumber;
        }

        public String getType() {
            return type;
        }

        public double getRentalRate() {
            return rentalRate;
        }

        // Setter methods
        public void setVehicleNumber(String vehicleNumber) {
            this.vehicleNumber = vehicleNumber;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setRentalRate(double rentalRate) {
            this.rentalRate = rentalRate;
        }

        // Abstract rental cost calculation
        public abstract double calculateRentalCost(int days);

        public void displayDetails(int days) {
            System.out.println("Vehicle Number: " + vehicleNumber);
            System.out.println("Type: " + type);
            System.out.println("Rental Rate: ₹" + rentalRate);
            System.out.println(
                    "Rental Cost for " + days + " days: ₹"
                            + calculateRentalCost(days)
            );
        }
    }

    // Car
    static class Car extends Vehicle implements Insurable {
        private String insurancePolicyNumber;

        Car(String vehicleNumber, double rentalRate,
            String insurancePolicyNumber) {

            super(vehicleNumber, "Car", rentalRate);
            this.insurancePolicyNumber = insurancePolicyNumber;
        }

        @Override
        public double calculateRentalCost(int days) {
            return getRentalRate() * days;
        }

        @Override
        public double calculateInsurance() {
            return 5000;
        }

        @Override
        public String getInsuranceDetails() {
            return "Car insurance policy: " + insurancePolicyNumber;
        }
    }

    // Bike
    static class Bike extends Vehicle implements Insurable {
        private String insurancePolicyNumber;

        Bike(String vehicleNumber, double rentalRate,
             String insurancePolicyNumber) {

            super(vehicleNumber, "Bike", rentalRate);
            this.insurancePolicyNumber = insurancePolicyNumber;
        }

        @Override
        public double calculateRentalCost(int days) {
            return getRentalRate() * days;
        }

        @Override
        public double calculateInsurance() {
            return 2000;
        }

        @Override
        public String getInsuranceDetails() {
            return "Bike insurance policy: " + insurancePolicyNumber;
        }
    }

    // Truck
    static class Truck extends Vehicle implements Insurable {
        private String insurancePolicyNumber;

        Truck(String vehicleNumber, double rentalRate,
              String insurancePolicyNumber) {

            super(vehicleNumber, "Truck", rentalRate);
            this.insurancePolicyNumber = insurancePolicyNumber;
        }

        @Override
        public double calculateRentalCost(int days) {
            return getRentalRate() * days;
        }

        @Override
        public double calculateInsurance() {
            return 8000;
        }

        @Override
        public String getInsuranceDetails() {
            return "Truck insurance policy: " + insurancePolicyNumber;
        }
    }

    public static void main(String[] args) {

        // Create vehicles using Vehicle references
        Vehicle car =
                new Car("CAR101", 3000, "CAR-POLICY-001");

        Vehicle bike =
                new Bike("BIKE101", 1000, "BIKE-POLICY-001");

        Vehicle truck =
                new Truck("TRUCK101", 5000, "TRUCK-POLICY-001");

        // Store different vehicle types in one list
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        int rentalDays = 3;

        // Runtime polymorphism
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails(rentalDays);

            Insurable insurable = (Insurable) vehicle;

            System.out.println(
                    "Insurance Cost: ₹" + insurable.calculateInsurance()
            );

            System.out.println(
                    insurable.getInsuranceDetails()
            );

            System.out.println();
        }
    }
}