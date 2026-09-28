package javaControlFlow.level1;

import java.util.Scanner;

/**
 * Problem 17 (GCR — Control Flow Assignment)
 * Create a program to find the bonus of employees based on
 * their years of service.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take salary from the user
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        // Take years of service from the user
        System.out.print("Enter years of service: ");
        double yearsOfService = input.nextDouble();

        // Calculate bonus based on years of service
        double bonus = 0;

        if (yearsOfService > 5) {
            bonus = salary * 5 / 100;
        }

        // Display the bonus amount
        System.out.println("The bonus amount is " + bonus);

        input.close();
    }
}
