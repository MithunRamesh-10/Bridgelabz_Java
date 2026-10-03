package JavaConstructors.StaticThisFinalInstanceof.Level1;

import java.util.Scanner;

/**
 * Problem 7 (GCR — Java Constructors Static, This, Final and Instanceof Assignment)
 * Demonstrate static, this, final and instanceof using Hospital Management.
 *
 * Author : Mithun
 * Date : 03-10-2026
 */

class Patient {

    // Static variable
    static String hospitalName = "City Hospital";

    // Static counter
    static int totalPatients = 0;

    // Instance variables
    String name;
    int age;
    String ailment;

    // Final variable
    final int patientID;

    // Constructor
    public Patient(String name, int age,
                   String ailment, int patientID) {

        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;

        totalPatients++;
    }

    // Static method
    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    // Display patient details
    public void displayDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("Patient ID: " + patientID);
    }
}

public class HospitalManagementSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter patient name: ");
        String name = input.nextLine();

        System.out.print("Enter patient age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.print("Enter ailment: ");
        String ailment = input.nextLine();

        System.out.print("Enter patient ID: ");
        int patientID = input.nextInt();

        Patient patient = new Patient(
                name,
                age,
                ailment,
                patientID
        );

        if (patient instanceof Patient) {
            System.out.println("\nPatient Details:");
            patient.displayDetails();
        }

        System.out.println();
        Patient.getTotalPatients();

        input.close();
    }
}