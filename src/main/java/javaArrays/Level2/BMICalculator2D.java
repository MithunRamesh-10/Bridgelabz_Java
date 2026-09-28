package javaArrays.level2;

import java.util.Scanner;

/**
 * Problem 7 (GCR — Java Arrays Level 2 Assignment)
 * Rewrite the BMI program using a 2D array to store height, weight,
 * and BMI for all persons, along with a separate status array.
 *
 * Author : Mithun
 * Date : 22-09-2026
 */
public class BMIUsing2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the number of persons
        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        // Validate the number of persons
        if (number <= 0) {
            System.out.println("Invalid Number.");
            input.close();
            return;
        }

        // Create a 2D array for height, weight and BMI
        double[][] personData = new double[number][3];

        // Create an array for weight status
        String[] weightStatus = new String[number];

        // Take height and weight input
        for (int i = 0; i < number; i++) {

            // Take valid weight
            do {
                System.out.print("Enter weight of person " + (i + 1) + " in kg: ");
                personData[i][1] = input.nextDouble();

                if (personData[i][1] <= 0) {
                    System.out.println("Invalid weight. Enter a positive value.");
                }
            } while (personData[i][1] <= 0);

            // Take valid height
            do {
                System.out.print("Enter height of person " + (i + 1) + " in cm: ");
                personData[i][0] = input.nextDouble();

                if (personData[i][0] <= 0) {
                    System.out.println("Invalid height. Enter a positive value.");
                }
            } while (personData[i][0] <= 0);
        }

        // Calculate BMI and status
        for (int i = 0; i < number; i++) {

            // Convert height to meters
            double heightInMeter = personData[i][0] / 100;

            // Calculate and store BMI
            personData[i][2] = personData[i][1] /
                    (heightInMeter * heightInMeter);

            // Determine weight status
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display height, weight, BMI and status
        System.out.println("\nPerson Details:");

        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height: " + personData[i][0] + " cm");
            System.out.println("Weight: " + personData[i][1] + " kg");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
        }

        input.close();
    }
}
