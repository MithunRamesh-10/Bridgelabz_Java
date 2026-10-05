package javaAbstraction;

import java.util.ArrayList;

/**
 * Problem 7: Hospital Patient Management
 *
 * Demonstrates abstraction, encapsulation, interfaces
 * and polymorphism in a hospital patient system.
 *
 * Author : Mithun
 * Date : 03-10-2026
 */
public class HospitalPatientManagement {

    // Interface for medical records
    interface MedicalRecord {
        void addRecord(String record);

        void viewRecords();
    }

    // Abstract Patient class
    static abstract class Patient {
        private int patientId;
        private String name;
        private int age;
        private String diagnosis;

        Patient(int patientId, String name, int age, String diagnosis) {
            this.patientId = patientId;
            this.name = name;
            this.age = age;
            this.diagnosis = diagnosis;
        }

        // Getter methods
        public int getPatientId() {
            return patientId;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getDiagnosis() {
            return diagnosis;
        }

        // Setter methods
        public void setPatientId(int patientId) {
            this.patientId = patientId;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setDiagnosis(String diagnosis) {
            this.diagnosis = diagnosis;
        }

        // Abstract billing method
        public abstract double calculateBill();

        // Concrete method
        public void getPatientDetails() {
            System.out.println("Patient ID: " + patientId);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Diagnosis: " + diagnosis);
            System.out.println(
                    "Bill: ₹" + calculateBill()
            );
        }
    }

    // In-patient
    static class InPatient extends Patient implements MedicalRecord {
        private ArrayList<String> records = new ArrayList<>();

        InPatient(int patientId, String name, int age,
                  String diagnosis) {
            super(patientId, name, age, diagnosis);
        }

        @Override
        public double calculateBill() {
            return 5000;
        }

        @Override
        public void addRecord(String record) {
            records.add(record);
        }

        @Override
        public void viewRecords() {
            System.out.println("Medical Records:");

            for (String record : records) {
                System.out.println("- " + record);
            }
        }
    }

    // Out-patient
    static class OutPatient extends Patient implements MedicalRecord {
        private ArrayList<String> records = new ArrayList<>();

        OutPatient(int patientId, String name, int age,
                   String diagnosis) {
            super(patientId, name, age, diagnosis);
        }

        @Override
        public double calculateBill() {
            return 1000;
        }

        @Override
        public void addRecord(String record) {
            records.add(record);
        }

        @Override
        public void viewRecords() {
            System.out.println("Medical Records:");

            for (String record : records) {
                System.out.println("- " + record);
            }
        }
    }

    public static void main(String[] args) {

        // Create different patient types
        Patient inPatient =
                new InPatient(
                        101,
                        "Hemang",
                        22,
                        "Fever"
                );

        Patient outPatient =
                new OutPatient(
                        102,
                        "Rahul",
                        24,
                        "Cold"
                );

        // Store patients using Patient references
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(inPatient);
        patients.add(outPatient);

        // Runtime polymorphism
        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println();
        }

        // Add and view medical records
        MedicalRecord record = (MedicalRecord) inPatient;

        record.addRecord("Temperature checked");
        record.addRecord("Blood test completed");

        record.viewRecords();
    }
}