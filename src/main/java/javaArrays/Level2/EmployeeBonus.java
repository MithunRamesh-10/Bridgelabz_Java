package javaArrays.Level2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] salaries = new double[10];
        int[] yearsOfService = new int[10];

        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i = 0; i < 10; i++) {

            while (true) {
                System.out.print("Enter salary of employee " + (i + 1) + ": ");
                double salary = input.nextDouble();

                System.out.print("Enter years of service: ");
                int years = input.nextInt();

                if (salary > 0 && years >= 0) {
                    salaries[i] = salary;
                    yearsOfService[i] = years;
                    break;
                }

                System.out.println("Invalid input. Enter positive salary and valid years of service.");
            }
        }

        for (int i = 0; i < 10; i++) {

            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05;
            } else {
                bonuses[i] = salaries[i] * 0.02;
            }

            newSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("\nEmployee Details:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1));
            System.out.println("Old Salary = " + salaries[i]);
            System.out.println("Years of Service = " + yearsOfService[i]);
            System.out.println("Bonus = " + bonuses[i]);
            System.out.println("New Salary = " + newSalaries[i]);
            System.out.println();
        }

        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);

        input.close();
    }
}
