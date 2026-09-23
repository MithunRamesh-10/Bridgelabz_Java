package javaArrays.Level2;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];

        for (int i = 0; i < number; i++) {

            while (true) {

                System.out.print("Enter weight of person " + (i + 1) + " in kg: ");
                weight[i] = input.nextDouble();

                System.out.print("Enter height of person " + (i + 1) + " in meters: ");
                height[i] = input.nextDouble();

                if (weight[i] > 0 && height[i] > 0) {
                    break;
                }

                System.out.println("Invalid input. Enter positive values.");
            }
        }

        for (int i = 0; i < number; i++) {

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        System.out.println("\nPerson Details:");

        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight = " + weight[i] + " kg");
            System.out.println("Height = " + height[i] + " m");
            System.out.println("BMI = " + bmi[i]);
            System.out.println("Status = " + status[i]);
            System.out.println();
        }

        input.close();
    }
}