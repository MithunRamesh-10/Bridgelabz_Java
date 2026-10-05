package javaAbstraction;

import java.util.ArrayList;

/**
 * Problem 8: Ride-Hailing Application
 *
 * Demonstrates abstraction, encapsulation, interfaces
 * and polymorphism in a ride-hailing system.
 *
 * Author : Mithun
 * Date : 03-10-2026
 */
public class RideHailingApplication {

    // Interface for GPS behavior
    interface GPS {
        String getCurrentLocation();

        void updateLocation(String location);
    }

    // Abstract Vehicle class
    static abstract class Vehicle {
        private int vehicleId;
        private String driverName;
        private double ratePerKm;

        Vehicle(int vehicleId, String driverName, double ratePerKm) {
            this.vehicleId = vehicleId;
            this.driverName = driverName;
            this.ratePerKm = ratePerKm;
        }

        // Getter methods
        public int getVehicleId() {
            return vehicleId;
        }

        public String getDriverName() {
            return driverName;
        }

        public double getRatePerKm() {
            return ratePerKm;
        }

        // Setter methods
        public void setVehicleId(int vehicleId) {
            this.vehicleId = vehicleId;
        }

        public void setDriverName(String driverName) {
            this.driverName = driverName;
        }

        public void setRatePerKm(double ratePerKm) {
            this.ratePerKm = ratePerKm;
        }

        // Abstract fare calculation
        public abstract double calculateFare(double distance);

        // Concrete vehicle details
        public void getVehicleDetails() {
            System.out.println("Vehicle ID: " + vehicleId);
            System.out.println("Driver Name: " + driverName);
            System.out.println("Rate Per Km: ₹" + ratePerKm);
        }
    }

    // Car
    static class Car extends Vehicle implements GPS {
        private String location = "Chennai";

        Car(int vehicleId, String driverName, double ratePerKm) {
            super(vehicleId, driverName, ratePerKm);
        }

        @Override
        public double calculateFare(double distance) {
            return distance * getRatePerKm();
        }

        @Override
        public String getCurrentLocation() {
            return location;
        }

        @Override
        public void updateLocation(String location) {
            this.location = location;
        }
    }

    // Bike
    static class Bike extends Vehicle implements GPS {
        private String location = "Chennai";

        Bike(int vehicleId, String driverName, double ratePerKm) {
            super(vehicleId, driverName, ratePerKm);
        }

        @Override
        public double calculateFare(double distance) {
            return distance * getRatePerKm();
        }

        @Override
        public String getCurrentLocation() {
            return location;
        }

        @Override
        public void updateLocation(String location) {
            this.location = location;
        }
    }

    // Auto
    static class Auto extends Vehicle implements GPS {
        private String location = "Chennai";

        Auto(int vehicleId, String driverName, double ratePerKm) {
            super(vehicleId, driverName, ratePerKm);
        }

        @Override
        public double calculateFare(double distance) {
            return distance * getRatePerKm();
        }

        @Override
        public String getCurrentLocation() {
            return location;
        }

        @Override
        public void updateLocation(String location) {
            this.location = location;
        }
    }

    public static void main(String[] args) {

        // Create different vehicle types
        Vehicle car =
                new Car(101, "Hemang", 20);

        Vehicle bike =
                new Bike(102, "Rahul", 10);

        Vehicle auto =
                new Auto(103, "Amit", 15);

        // Store vehicles using Vehicle references
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        double distance = 10;

        // Runtime polymorphism
        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();

            System.out.println(
                    "Fare for " + distance + " km: ₹"
                            + vehicle.calculateFare(distance)
            );

            System.out.println();
        }

        // GPS interface
        GPS carGPS = (GPS) car;

        System.out.println(
                "Current Location: " + carGPS.getCurrentLocation()
        );

        carGPS.updateLocation("Tambaram");

        System.out.println(
                "Updated Location: " + carGPS.getCurrentLocation()
        );
    }
}