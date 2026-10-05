package javaObjectModeling;

import java.util.ArrayList;

/**
 * Problem 6: Hospital, Doctors, and Patients
 *
 * Demonstrates association and communication between
 * Doctor and Patient objects through consultations.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class HospitalDoctorsPatients {

    static class Doctor {
        String doctorName;
        ArrayList<Patient> patients = new ArrayList<>();

        Doctor(String doctorName) {
            this.doctorName = doctorName;
        }

        void consult(Patient patient) {
            patients.add(patient);

            System.out.println(
                    doctorName + " is consulting " + patient.patientName
            );
        }
    }

    static class Patient {
        String patientName;

        Patient(String patientName) {
            this.patientName = patientName;
        }
    }

    static class Hospital {
        String hospitalName;
        ArrayList<Doctor> doctors = new ArrayList<>();
        ArrayList<Patient> patients = new ArrayList<>();

        Hospital(String hospitalName) {
            this.hospitalName = hospitalName;
        }

        void addDoctor(Doctor doctor) {
            doctors.add(doctor);
        }

        void addPatient(Patient patient) {
            patients.add(patient);
        }

        void displayDetails() {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Doctors: " + doctors.size());
            System.out.println("Patients: " + patients.size());
        }
    }

    public static void main(String[] args) {

        // Create hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create doctors
        Doctor doctor1 = new Doctor("Dr. Sharma");
        Doctor doctor2 = new Doctor("Dr. Mehta");

        // Create patients
        Patient patient1 = new Patient("Rahul");
        Patient patient2 = new Patient("Priya");

        // Add doctors and patients to hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Doctors consult patients
        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);

        // Display hospital details
        System.out.println();
        hospital.displayDetails();
    }
}