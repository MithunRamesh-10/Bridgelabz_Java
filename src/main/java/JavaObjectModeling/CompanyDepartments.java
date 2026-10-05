package javaObjectModeling;

import java.util.ArrayList;

/**
 * Problem 3: Company and Departments - Composition
 *
 * Demonstrates a composition relationship where a Company
 * contains Departments and each Department contains Employees.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class CompanyDepartments {

    static class Employee {
        String name;

        Employee(String name) {
            this.name = name;
        }

        void displayEmployee() {
            System.out.println("Employee: " + name);
        }
    }

    static class Department {
        String departmentName;
        ArrayList<Employee> employees = new ArrayList<>();

        Department(String departmentName) {
            this.departmentName = departmentName;
        }

        void addEmployee(Employee employee) {
            employees.add(employee);
        }

        void displayDepartment() {
            System.out.println("Department: " + departmentName);

            for (Employee employee : employees) {
                employee.displayEmployee();
            }
        }
    }

    static class Company {
        String companyName;
        ArrayList<Department> departments = new ArrayList<>();

        Company(String companyName) {
            this.companyName = companyName;
        }

        void addDepartment(Department department) {
            departments.add(department);
        }

        void displayCompany() {
            System.out.println("Company: " + companyName);

            for (Department department : departments) {
                department.displayDepartment();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        // Create Company
        Company company = new Company("Tech Solutions");

        // Create Departments
        Department development = new Department("Development");
        Department testing = new Department("Testing");

        // Create Employees
        Employee employee1 = new Employee("Amit");
        Employee employee2 = new Employee("Neha");
        Employee employee3 = new Employee("Rohit");

        // Add employees to departments
        development.addEmployee(employee1);
        development.addEmployee(employee2);
        testing.addEmployee(employee3);

        // Add departments to company
        company.addDepartment(development);
        company.addDepartment(testing);

        // Display company details
        company.displayCompany();
    }
}