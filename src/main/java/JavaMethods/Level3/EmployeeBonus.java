package javaMethods.level3;

/**
 * Problem 11 (GCR — Java Methods Level 3 Assignment)
 * Generate salary and years of service for 10 employees,
 * calculate bonus and new salary, and display totals.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class EmployeeBonus {

    // Method to generate salary and years of service
    public static double[][] generateEmployeeData(int size) {
        double[][] employees = new double[size][2];

        for (int i = 0; i < size; i++) {

            // Generate 5-digit salary
            employees[i][0] =
                    (int) (Math.random() * 90000) + 10000;

            // Generate years of service from 1 to 10
            employees[i][1] =
                    (int) (Math.random() * 10) + 1;
        }

        return employees;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonus(
            double[][] employees) {

        double[][] result =
                new double[employees.length][2];

        for (int i = 0; i < employees.length; i++) {

            double salary = employees[i][0];
            double years = employees[i][1];

            double bonusRate;

            // More than 5 years gets 5%, otherwise 2%
            if (years > 5) {
                bonusRate = 0.05;
            } else {
                bonusRate = 0.02;
            }

            // Calculate bonus and new salary
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            result[i][0] = newSalary;
            result[i][1] = bonus;
        }

        return result;
    }

    // Method to calculate totals
    public static double[] calculateTotals(
            double[][] employees,
            double[][] result) {

        double oldSalaryTotal = 0;
        double newSalaryTotal = 0;
        double bonusTotal = 0;

        for (int i = 0; i < employees.length; i++) {
            oldSalaryTotal += employees[i][0];
            newSalaryTotal += result[i][0];
            bonusTotal += result[i][1];
        }

        return new double[]{
                oldSalaryTotal,
                newSalaryTotal,
                bonusTotal
        };
    }

    public static void main(String[] args) {

        // Generate employee data
        double[][] employees =
                generateEmployeeData(10);

        // Calculate bonus and new salary
        double[][] result =
                calculateBonus(employees);

        // Calculate totals
        double[] totals =
                calculateTotals(employees, result);

        // Display table
        System.out.println(
                "Employee\tOld Salary\tYears\tBonus\tNew Salary");

        for (int i = 0; i < employees.length; i++) {

            System.out.printf(
                    "%d\t\t%.2f\t%.0f\t%.2f\t%.2f%n",
                    i + 1,
                    employees[i][0],
                    employees[i][1],
                    result[i][1],
                    result[i][0]
            );
        }

        // Display totals
        System.out.println("\nTotal Old Salary: "
                + totals[0]);

        System.out.println("Total New Salary: "
                + totals[1]);

        System.out.println("Total Bonus: "
                + totals[2]);
    }
}
