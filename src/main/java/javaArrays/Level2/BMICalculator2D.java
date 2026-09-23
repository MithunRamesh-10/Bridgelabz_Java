package javaArrays.Level2;

import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {

            while (true) {

                System.out.print("Enter weight of person " + (i + 1) + " in kg: ");
                double weight = input.nextDouble();

                System.out.print("Enter height of person " + (i + 1) + " in meters: ");
                double height = input.nextDouble();

                if (weight > 0 && height > 0) {

                    personData[i][0] = weight;
                    personData[i][1] = height;

                    break;
                }

                System.out.println("Invalid input. Enter positive values.");
            }
        }

        for (int i = 0; i < number; i++) {

            double weight = personData[i][0];
            double height = personData[i][1];

            personData[i][2] = weight / (height * height);

            double bmi = personData[i][2];

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nPerson Details:");

        for (int i = 0; i < number; i++) {

            System.out.println("Person " + (i + 1));
            System.out.println("Weight = " + personData[i][0] + " kg");
            System.out.println("Height = " + personData[i][1] + " m");
            System.out.println("BMI = " + personData[i][2]);
            System.out.println("Status = " + weightStatus[i]);
            System.out.println();
        }

        input.close();
    }
}
