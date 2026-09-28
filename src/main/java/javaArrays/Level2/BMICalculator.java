package javaArrays.level2;

import java.util.Scanner;

/**
 * Problem 6 (GCR — Java Arrays Level 2 Assignment)
 * Calculate the BMI of all persons and store height, weight, BMI,
 * and weight status in separate arrays. Display the details of each person.
 *
 * Author : Mithun
 * Date : 22-09-2026
 */
public class BMIOfPersons {
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

        // Create arrays for height, weight, BMI and status
        double[] height = new double[number];
        double[] weight = new double[number];
        double[] bmi = new double[number];
        String[] weightStatus = new String[number];

        // Take height and weight for each person
        for (int i = 0; i < number; i++) {

            // Take valid weight
            do {
                System.out.print("Enter weight of person " + (i + 1) + " in kg: ");
                weight[i] = input.nextDouble();

                if (weight[i] <= 0) {
                    System.out.println("Invalid weight. Enter a positive value.");
                }
            } while (weight[i] <= 0);

            // Take valid height
            do {
                System.out.print("Enter height of person " + (i + 1) + " in cm: ");
                height[i] = input.nextDouble();

                if (height[i] <= 0) {
                    System.out.println("Invalid height. Enter a positive value.");
                }
            } while (height[i] <= 0);
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < number; i++) {

            // Convert height from centimeters to meters
            double heightInMeter = height[i] / 100;

            // Calculate BMI
            bmi[i] = weight[i] / (heightInMeter * heightInMeter);

            // Determine weight status
            if (bmi[i] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the details of each person
        System.out.println("\nPerson Details:");

        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height: " + height[i] + " cm");
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Status: " + weightStatus[i]);
        }

        input.close();
    }
}
