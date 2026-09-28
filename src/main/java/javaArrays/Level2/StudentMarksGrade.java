package javaArrays.level2;

import java.util.Scanner;

/**
 * Problem 8 (GCR — Java Arrays Level 2 Assignment)
 * Take Physics, Chemistry, and Maths marks for students,
 * calculate the percentage and grade, and display the results.
 *
 * Author : Mithun
 * Date : 22-09-2026
 */
public class StudentMarksGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the number of students
        System.out.print("Enter number of students: ");
        int number = input.nextInt();

        // Validate the number of students
        if (number <= 0) {
            System.out.println("Invalid Number.");
            input.close();
            return;
        }

        // Create arrays for marks, percentage and grade
        double[] physics = new double[number];
        double[] chemistry = new double[number];
        double[] maths = new double[number];
        double[] percentage = new double[number];
        String[] grade = new String[number];

        // Take marks for each student
        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1));

            // Take valid Physics marks
            do {
                System.out.print("Enter Physics marks: ");
                physics[i] = input.nextDouble();

                if (physics[i] < 0) {
                    System.out.println("Invalid marks. Enter positive values.");
                }
            } while (physics[i] < 0);

            // Take valid Chemistry marks
            do {
                System.out.print("Enter Chemistry marks: ");
                chemistry[i] = input.nextDouble();

                if (chemistry[i] < 0) {
                    System.out.println("Invalid marks. Enter positive values.");
                }
            } while (chemistry[i] < 0);

            // Take valid Maths marks
            do {
                System.out.print("Enter Maths marks: ");
                maths[i] = input.nextDouble();

                if (maths[i] < 0) {
                    System.out.println("Invalid marks. Enter positive values.");
                }
            } while (maths[i] < 0);
        }

        // Calculate percentage and grade
        for (int i = 0; i < number; i++) {

            // Calculate average percentage
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;

            // Calculate grade
            if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else if (percentage[i] >= 40) {
                grade[i] = "E";
            } else {
                grade[i] = "R";
            }
        }

        // Display the student details
        System.out.println("\nStudent Results:");

        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + physics[i]);
            System.out.println("Chemistry: " + chemistry[i]);
            System.out.println("Maths: " + maths[i]);
            System.out.println("Percentage: " + percentage[i]);
            System.out.println("Grade: " + grade[i]);
        }

        input.close();
    }
}
