package javaString.level3;

import java.util.Scanner;

/**
 * Problem 1 (GCR — Java String Level 3 Assignment)
 * Find the BMI of 10 persons and display their height,
 * weight, BMI and status.
 *
 * Author : Mithun
 * Date : 25-09-2026
 */
public class BMICalculator {

    // Calculate BMI and status for one person
    public static String[] calculateBMI(double weight, double heightCm) {
        // Convert height from centimetres to metres
        double heightMeter = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightMeter * heightMeter);

        // Round BMI to 2 decimal places
        bmi = Math.round(bmi * 100.0) / 100.0;

        String status;

        // Determine BMI status
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{
                String.valueOf(heightCm),
                String.valueOf(weight),
                String.valueOf(bmi),
                status
        };
    }

    // Calculate BMI for all persons
    public static String[][] calculateAllBMI(double[][] persons) {
        String[][] result = new String[persons.length][4];

        for (int i = 0; i < persons.length; i++) {
            result[i] = calculateBMI(
                    persons[i][0],
                    persons[i][1]
            );
        }

        return result;
    }

    // Display BMI result in tabular format
    public static void displayBMI(String[][] result) {
        System.out.printf(
                "%-10s %-12s %-10s %-15s%n",
                "Height", "Weight", "BMI", "Status"
        );

        for (int i = 0; i < result.length; i++) {
            System.out.printf(
                    "%-10s %-12s %-10s %-15s%n",
                    result[i][0],
                    result[i][1],
                    result[i][2],
                    result[i][3]
            );
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] persons = new double[10][2];

        // Take weight and height for 10 persons
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1));

            System.out.print("Enter weight in kg: ");
            persons[i][0] = input.nextDouble();

            System.out.print("Enter height in cm: ");
            persons[i][1] = input.nextDouble();
        }

        // Calculate BMI and status
        String[][] result = calculateAllBMI(persons);

        // Display result
        System.out.println("\nBMI Report:");
        displayBMI(result);

        input.close();
    }
}
