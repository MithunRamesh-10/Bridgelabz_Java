package javaControlFlow.level2;

import java.util.Scanner;

/**
 * Problem 7 (GCR — Control Flow Level 2 Assignment)
 * Create a program to find the BMI of a person.
 * Take weight in kg and height in cm, convert height to meters,
 * calculate BMI, and display the weight status.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take weight in kilograms
        System.out.print("Enter weight in kg: ");
        double weight = input.nextDouble();

        // Take height in centimeters
        System.out.print("Enter height in cm: ");
        double heightInCm = input.nextDouble();

        // Convert height from centimeters to meters
        double heightInMeter = heightInCm / 100;

        // Calculate BMI
        double bmi = weight / (heightInMeter * heightInMeter);

        // Determine the BMI status
        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display the result
        System.out.println("BMI: " + bmi);
        System.out.println("Status: " + status);

        input.close();
    }
}
