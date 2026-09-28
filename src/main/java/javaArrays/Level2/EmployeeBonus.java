package javaArrays.level2;

import java.util.Scanner;

/**
 * Problem 1 (GCR — Java Arrays Level 2 Assignment)
 * Calculate the bonus of 10 employees based on their years of service.
 * Employees with more than 5 years get 5% bonus, otherwise they get 2%.
 * Display the total bonus, old salary, and new salary.
 *
 * Author : Mithun
 * Date : 22-09-2026
 */
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create arrays to store salary and years of service
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];

        // Create arrays to store bonus and new salary
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Initialize total values
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Take input for 10 employees
        int index = 0;

        while (index < salary.length) {
            System.out.println("Employee " + (index + 1));

            // Take salary
            System.out.print("Enter salary: ");
            double employeeSalary = input.nextDouble();

            // Take years of service
            System.out.print("Enter years of service: ");
            double service = input.nextDouble();

            // Validate salary and years of service
            if (employeeSalary < 0 || service < 0) {
                System.out.println("Invalid input. Please enter positive values.");
                continue;
            }

            // Store valid values
            salary[index] = employeeSalary;
            yearsOfService[index] = service;

            // Move to the next employee
            index++;
        }

        // Calculate bonus and new salary
        for (int i = 0; i < salary.length; i++) {

            // Give 5% bonus for more than 5 years of service
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            }
            // Give 2% bonus otherwise
            else {
                bonus[i] = salary[i] * 0.02;
            }

            // Calculate new salary
            newSalary[i] = salary[i] + bonus[i];

            // Calculate totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display the total values
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        input.close();
    }
}
