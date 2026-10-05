package javaObjectModeling;

import java.util.ArrayList;

/**
 * Problem 5: University with Faculties and Departments
 *
 * Demonstrates composition between University and Department
 * and aggregation between University and Faculty.
 *
 * Author : Hemang
 * Date : 01-10-2026
 */
public class UniversityFacultiesDepartments {

    static class Department {
        String departmentName;

        Department(String departmentName) {
            this.departmentName = departmentName;
        }
    }

    static class Faculty {
        String facultyName;

        Faculty(String facultyName) {
            this.facultyName = facultyName;
        }
    }

    static class University {
        String universityName;
        ArrayList<Department> departments = new ArrayList<>();
        ArrayList<Faculty> faculties = new ArrayList<>();

        University(String universityName) {
            this.universityName = universityName;
        }

        void addDepartment(Department department) {
            departments.add(department);
        }

        void addFaculty(Faculty faculty) {
            faculties.add(faculty);
        }

        void displayDetails() {
            System.out.println("University: " + universityName);

            System.out.println("Departments:");
            for (Department department : departments) {
                System.out.println("- " + department.departmentName);
            }

            System.out.println("Faculty Members:");
            for (Faculty faculty : faculties) {
                System.out.println("- " + faculty.facultyName);
            }
        }
    }

    public static void main(String[] args) {

        // Create university
        University university = new University("SRM University");

        // Create departments
        Department cse = new Department("Computer Science");
        Department ece = new Department("Electronics");

        // Create faculty independently
        Faculty faculty1 = new Faculty("Dr. Sharma");
        Faculty faculty2 = new Faculty("Dr. Mehta");

        // Add departments to university
        university.addDepartment(cse);
        university.addDepartment(ece);

        // Add faculty to university
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        // Display university details
        university.displayDetails();
    }
}