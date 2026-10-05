package javaAbstraction;

import java.util.ArrayList;

/**
 * Problem 1: Employee Management System
 *
 * Demonstrates encapsulation, abstraction, interface,
 * inheritance and polymorphism.
 *
 * Author : Mithun
 * Date : 03-10-2026
 */
public class EmployeeManagementSystem {

    // Interface for department-related behavior
    interface Department {
        void assignDepartment(String department);

        String getDepartmentDetails();
    }

    // Abstract class containing common employee details
    static abstract class Employee {
        private int employeeId;
        private String name;
        private double baseSalary;
        private String department;

        Employee(int employeeId, String name, double baseSalary) {
            this.employeeId = employeeId;
            this.name = name;
            this.baseSalary = baseSalary;
        }

        // Getter methods
        public int getEmployeeId() {
            return employeeId;
        }

        public String getName() {
            return name;
        }

        public double getBaseSalary() {
            return baseSalary;
        }

        // Setter methods
        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setBaseSalary(double baseSalary) {
            this.baseSalary = baseSalary;
        }

        // Abstract method implemented by subclasses
        public abstract double calculateSalary();

        // Display common employee details
        public void displayDetails() {
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Name: " + name);
            System.out.println("Base Salary: " + baseSalary);
            System.out.println("Department: " + department);
            System.out.println("Calculated Salary: " + calculateSalary());
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getDepartment() {
            return department;
        }
    }

    // Full-time employee
    static class FullTimeEmployee extends Employee implements Department {

        FullTimeEmployee(int employeeId, String name, double baseSalary) {
            super(employeeId, name, baseSalary);
        }

        @Override
        public double calculateSalary() {
            return getBaseSalary();
        }

        @Override
        public void assignDepartment(String department) {
            setDepartment(department);
        }

        @Override
        public String getDepartmentDetails() {
            return getDepartment();
        }
    }

    // Part-time employee
    static class PartTimeEmployee extends Employee implements Department {
        private int workHours;
        private double hourlyRate;

        PartTimeEmployee(int employeeId, String name,
                         double baseSalary, int workHours,
                         double hourlyRate) {
            super(employeeId, name, baseSalary);
            this.workHours = workHours;
            this.hourlyRate = hourlyRate;
        }

        @Override
        public double calculateSalary() {
            return workHours * hourlyRate;
        }

        @Override
        public void assignDepartment(String department) {
            setDepartment(department);
        }

        @Override
        public String getDepartmentDetails() {
            return getDepartment();
        }
    }

    public static void main(String[] args) {

        // Create employee objects using Employee references
        Employee employee1 =
                new FullTimeEmployee(101, "Hemang", 50000);

        Employee employee2 =
                new PartTimeEmployee(102, "Rahul", 20000, 80, 300);

        // Assign departments using interface reference
        Department department1 = (Department) employee1;
        Department department2 = (Department) employee2;

        department1.assignDepartment("Development");
        department2.assignDepartment("Testing");

        // Store different employee types in one list
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);

        // Runtime polymorphism
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println();
        }
    }
}