package JavaAccessModifiers.Level1;

import java.util.Scanner;

/**
 * Problem 4 (GCR — Java Access Modifiers Level 1 Assignment)
 * Create an Employee class with public, protected, and private members.
 * Demonstrate salary modification through a public method and access
 * to employeeID and department through a subclass.
 *
 * Author : Mithun
 * Date : 03-10-2026
 */

class Employee {

    // Public member
    public int employeeID;

    // Protected member
    protected String department;

    // Private member
    private double salary;

    // Public method to modify private salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Public method to access salary
    public double getSalary() {
        return salary;
    }
}

// Subclass demonstrating protected and public access
class Manager extends Employee {

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
    }
}

public class EmployeeRecords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Manager manager = new Manager();

        System.out.print("Enter employee ID: ");
        manager.employeeID = input.nextInt();

        input.nextLine();

        System.out.print("Enter department: ");
        manager.department = input.nextLine();

        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        manager.setSalary(salary);

        System.out.println("\nEmployee Details:");
        manager.displayEmployeeDetails();

        input.close();
    }
}