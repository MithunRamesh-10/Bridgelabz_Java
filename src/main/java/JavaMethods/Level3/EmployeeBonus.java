package javaMethods.Level3;

import java.util.Random;
import java.util.Scanner;

public class EmployeeBonus {

    public static double[] generateSalaryAndService(int size) {

        double[] data = new double[size * 2];

        Random random = new Random();

        for (int i = 0; i < size; i++) {

            // Salary between 30,000 and 80,000
            data[i * 2] =
                    30000 + random.nextInt(50001);

            // Years of service between 1 and 10
            data[i * 2 + 1] =
                    1 + random.nextInt(10);
        }

        return data;
    }

    public static double calculateBonus(
            double salary,
            double yearsOfService) {

        if (yearsOfService > 5) {
            return salary * 0.05;
        } else {
            return salary * 0.02;
        }
    }

    public static double[][] calculateNewSalary(
            double[][] employeeData) {

        double[][] result =
                new double[employeeData.length][3];

        for (int i = 0; i < employeeData.length; i++) {

            double salary = employeeData[i][0];
            double years = employeeData[i][1];

            double bonus =
                    calculateBonus(salary, years);

            double newSalary =
                    salary + bonus;

            result[i][0] = salary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
        }

        return result;
    }

    public static double[] calculateTotals(
            double[][] employeeData) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        for (double[] employee : employeeData) {

            totalOldSalary += employee[0];
            totalBonus += employee[1];
            totalNewSalary += employee[2];
        }

        return new double[]{
                totalOldSalary,
                totalNewSalary,
                totalBonus
        };
    }

    public static void main(String[] args) {

        int numberOfEmployees = 10;

        double[] data =
                generateSalaryAndService(
                        numberOfEmployees
                );

        double[][] employees =
                new double[numberOfEmployees][2];

        for (int i = 0; i < numberOfEmployees; i++) {

            employees[i][0] = data[i * 2];
            employees[i][1] = data[i * 2 + 1];
        }

        double[][] result =
                calculateNewSalary(employees);

        System.out.println(
                "Employee\tOld Salary\tService\tBonus\tNew Salary"
        );

        for (int i = 0; i < numberOfEmployees; i++) {

            System.out.printf(
                    "%d\t\t%.2f\t%.0f\t%.2f\t%.2f%n",
                    i + 1,
                    result[i][0],
                    employees[i][1],
                    result[i][1],
                    result[i][2]
            );
        }

        double[] totals =
                calculateTotals(result);

        System.out.println("\nTotal Old Salary: " + totals[0]);
        System.out.println("Total New Salary: " + totals[1]);
        System.out.println("Total Bonus: " + totals[2]);
    }
}