package javaThisStaticFinal;

/**
 * Problem 3 (GCR — this, static, final keywords and instanceof Operator)
 * Design an Employee class using static, this, final and instanceof.
 *
 * Author : Mithun
 * Date : 30-09-2026
 */
public class Employee {

    // Static variable shared by all employees
    static String companyName = "Tech Solutions";

    // Instance variables
    String name;
    String designation;

    // Final variable cannot be changed after initialization
    final int id;

    // Static variable to count employees
    static int totalEmployees = 0;

    // Constructor
    Employee(String name, int id, String designation) {

        // this initializes instance variables
        this.name = name;
        this.id = id;
        this.designation = designation;

        // Increase employee count
        totalEmployees++;
    }

    // Static method to display total employees
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Display employee details
    void displayEmployeeDetails() {
        System.out.println("Company     : " + companyName);
        System.out.println("Employee ID : " + id);
        System.out.println("Name        : " + name);
        System.out.println("Designation : " + designation);
    }

    public static void main(String[] args) {

        // Create Employee objects
        Employee employee1 =
                new Employee("Hemang", 101, "Developer");

        Employee employee2 =
                new Employee("Rahul", 102, "Tester");

        // Check employee1 type
        if (employee1 instanceof Employee) {
            System.out.println("Employee 1 is an Employee.");
            employee1.displayEmployeeDetails();
        }

        System.out.println();

        // Check employee2 type
        if (employee2 instanceof Employee) {
            System.out.println("Employee 2 is an Employee.");
            employee2.displayEmployeeDetails();
        }

        System.out.println();

        // Display total employees
        Employee.displayTotalEmployees();
    }
}