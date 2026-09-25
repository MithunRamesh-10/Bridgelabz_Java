package javaMethods.Level1;

import java.util.Scanner;

public class BMICalculator {

    public static double[] calculateBMI(double[][] data) {
        double[] bmi = new double[data.length];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInCm = data[i][1];

            double heightInMeters = heightInCm / 100;

            bmi[i] = weight / Math.pow(heightInMeters, 2);
        }

        return bmi;
    }

    public static String[] determineBMIStatus(double[] bmi) {
        String[] status = new String[bmi.length];

        for (int i = 0; i < bmi.length; i++) {

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

        return status;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2];

        // Input weight and height
        for (int i = 0; i < data.length; i++) {

            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter weight in kg: ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height in cm: ");
            data[i][1] = sc.nextDouble();
        }

        double[] bmi = calculateBMI(data);

        String[] status = determineBMIStatus(bmi);

        // Display results
        System.out.println("\nBMI Results");
        System.out.println("--------------------------------------------");
        System.out.println("Person\tWeight\tHeight\tBMI\tStatus");

        for (int i = 0; i < data.length; i++) {

            System.out.printf(
                    "%d\t%.2f\t%.2f\t%.2f\t%s%n",
                    i + 1,
                    data[i][0],
                    data[i][1],
                    bmi[i],
                    status[i]
            );
        }

        sc.close();
    }
}