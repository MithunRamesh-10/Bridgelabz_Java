package javaMethods.level2;

import java.util.Scanner;

/**
 * Problem 10 (GCR — Java Methods Level 2 Assignment)
 * Calculate BMI for 10 persons using a 2D array and
 * display weight, height, BMI, and BMI status.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class BMICalculator {

    // Method to calculate BMI for every person
    public static void calculateBMI(double[][] persons) {

        for (int i = 0; i < persons.length; i++) {

            // Convert height from centimetres to metres
            double heightInMeters = persons[i][1] / 100;

            // Calculate BMI
            persons[i][2] = persons[i][0]
                    / (heightInMeters * heightInMeters);
        }
    }

    // Method to determine BMI status
    public static String[] findBMIStatus(double[][] persons) {
        String[] status = new String[persons.length];

        for (int i = 0; i < persons.length; i++) {
            double bmi = persons[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create 10 rows and 3 columns
        double[][] persons = new double[10][3];

        // Take weight and height input
        for (int i = 0; i < persons.length; i++) {
            System.out.print("Enter weight (kg) for person "
                    + (i + 1) + ": ");
            persons[i][0] = input.nextDouble();

            System.out.print("Enter height (cm) for person "
                    + (i + 1) + ": ");
            persons[i][1] = input.nextDouble();
        }

        // Calculate BMI
        calculateBMI(persons);

        // Find BMI status
        String[] status = findBMIStatus(persons);

        // Display results
        System.out.println("\nWeight\tHeight\tBMI\tStatus");

        for (int i = 0; i < persons.length; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s%n",
                    persons[i][0],
                    persons[i][1],
                    persons[i][2],
                    status[i]);
        }

        input.close();
    }
}
