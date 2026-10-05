package javaThisStaticFinal;

/**
 * Problem 7 (GCR — this, static, final keywords and instanceof Operator)
 * Create a Patient class using static, this, final and instanceof.
 *
 * Author : Mithun
 * Date : 30-09-2026
 */
public class Patient {

    // Static variable shared by all patients
    static String hospitalName = "City Hospital";

    // Instance variables
    String name;
    int age;
    String ailment;

    // Final patient ID cannot be changed
    final int patientID;

    // Static variable to count patients
    static int totalPatients = 0;

    // Constructor
    Patient(String name, int age, String ailment,
            int patientID) {

        // this initializes instance variables
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;

        // Increase patient count
        totalPatients++;
    }

    // Static method to get total patients
    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    // Display patient details
    void displayPatientDetails() {
        System.out.println("Hospital : " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name     : " + name);
        System.out.println("Age      : " + age);
        System.out.println("Ailment  : " + ailment);
    }

    public static void main(String[] args) {

        // Create Patient objects
        Patient patient1 =
                new Patient("Hemang", 21, "Fever", 101);

        Patient patient2 =
                new Patient("Rahul", 22, "Cold", 102);

        // Check object type
        if (patient1 instanceof Patient) {
            System.out.println("Patient 1 is a Patient.");
            patient1.displayPatientDetails();
        }

        System.out.println();

        if (patient2 instanceof Patient) {
            System.out.println("Patient 2 is a Patient.");
            patient2.displayPatientDetails();
        }

        System.out.println();

        // Display total patients
        Patient.getTotalPatients();
    }
}