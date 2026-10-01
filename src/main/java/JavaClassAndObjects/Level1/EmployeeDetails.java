package JavaClassesAndObjects.Level1;

import java.util.Scanner;

/**
 * Problem 1 (GCR — Java Classes and Objects Level 1 Assignment)
 * Program to display employee details.
 *
 * Create an Employee class with attributes name, id, and salary.
 * Add a method to display the employee details.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */

class Employee {

    String name;
    int id;
    double salary;

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}

public class EmployeeDetails {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Employee employee = new Employee();

        // Take employee details
        System.out.print("Enter employee name: ");
        employee.name = input.nextLine();

        System.out.print("Enter employee ID: ");
        employee.id = input.nextInt();

        System.out.print("Enter employee salary: ");
        employee.salary = input.nextDouble();

        // Display employee details
        System.out.println("\nEmployee Details:");
        employee.displayDetails();

        input.close();
    }
}