package javaInheritance.assistedProblems;

/**
 * Problem 2: Employee Management System
 * Demonstrates inheritance and method overriding using employee types.
 *
 * Author : Mithun
 * Date : 02-10-2026
 */

class Employee {

    String name;
    int id;
    double salary;

    // Constructor to initialize employee details
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Display common employee details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {

    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    // Override displayDetails for Manager
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {

    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Override displayDetails for Developer
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {

    String internshipDuration;

    Intern(String name, int id, double salary, String internshipDuration) {
        super(name, id, salary);
        this.internshipDuration = internshipDuration;
    }

    // Override displayDetails for Intern
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + internshipDuration);
    }
}

public class EmployeeManagement {

    public static void main(String[] args) {

        // Parent class references holding child class objects
        Employee manager = new Manager("Rahul", 101, 75000, 8);

        Employee developer = new Developer("Amit", 102, 65000, "Java");

        Employee intern = new Intern("Neha", 103, 20000, "6 Months");

        // Runtime polymorphism
        System.out.println("Manager Details:");
        manager.displayDetails();

        System.out.println("\nDeveloper Details:");
        developer.displayDetails();

        System.out.println("\nIntern Details:");
        intern.displayDetails();
    }
}