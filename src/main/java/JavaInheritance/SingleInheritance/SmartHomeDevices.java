package javaInheritance.singleInheritance;

/**
 * Problem 2: Smart Home Devices
 * Demonstrates single inheritance using a smart home device.
 *
 * Author : Mithun
 * Date : 02-10-2026
 */

class Device {

    String deviceId;
    String status;

    // Constructor to initialize device details
    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Display device status
    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

class Thermostat extends Device {

    double temperatureSetting;

    Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Display thermostat status
    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class SmartHomeDevices {

    public static void main(String[] args) {

        // Create Thermostat object
        Thermostat thermostat = new Thermostat("TH-101", "ON", 24.0);

        // Display thermostat status
        thermostat.displayStatus();
    }
}