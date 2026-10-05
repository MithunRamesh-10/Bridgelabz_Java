package JavaConstructors.StaticThisFinalInstanceof.Level1;

import java.util.Scanner;

/**
 * Problem 3 (GCR — Java Constructors Static, This, Final and Instanceof Assignment)
 * Demonstrate static, this, final and instanceof using an Employee Management System.
 *
 * Author : Mithun
 * Date : 03-10-2026
 */

class Employee {

    // Static variable
    static String companyName = "ABC Technologies";

    // Static counter
    static int totalEmployees = 0;

    // Instance variables
    String name;
    String designation;

    // Final variable
    final int id;

    // Constructor
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;

        totalEmployees++;
    }

    // Static method
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Display employee details
    public void displayDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Designation: " + designation);
    }
}

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = input.nextLine();

        System.out.print("Enter employee ID: ");
        int id = input.nextInt();

        input.nextLine();

        System.out.print("Enter designation: ");
        String designation = input.nextLine();

        Employee employee = new Employee(name, id, designation);

        if (employee instanceof Employee) {
            System.out.println("\nEmployee Details:");
            employee.displayDetails();
        }

        System.out.println();
        Employee.displayTotalEmployees();

        input.close();
    }
}