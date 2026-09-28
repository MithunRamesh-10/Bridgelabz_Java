package javaArrays.level2;

import java.util.Scanner;

/**
 * Problem 9 (GCR — Java Arrays Level 2 Assignment)
 * Store Physics, Chemistry, and Maths marks in a 2D array.
 * Use the 2D array to calculate the percentage and grade of each student.
 *
 * Author : Mithun
 * Date : 22-09-2026
 */
public class StudentMarks2D {
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

        // Create a 2D array for Physics, Chemistry and Maths
        double[][] marks = new double[number][3];

        // Create arrays for percentage and grade
        double[] percentage = new double[number];
        String[] grade = new String[number];

        // Take marks for each student
        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1));

            // Take valid Physics marks
            do {
                System.out.print("Enter Physics marks: ");
                marks[i][0] = input.nextDouble();

                if (marks[i][0] < 0) {
                    System.out.println("Invalid marks. Enter positive values.");
                }
            } while (marks[i][0] < 0);

            // Take valid Chemistry marks
            do {
                System.out.print("Enter Chemistry marks: ");
                marks[i][1] = input.nextDouble();

                if (marks[i][1] < 0) {
                    System.out.println("Invalid marks. Enter positive values.");
                }
            } while (marks[i][1] < 0);

            // Take valid Maths marks
            do {
                System.out.print("Enter Maths marks: ");
                marks[i][2] = input.nextDouble();

                if (marks[i][2] < 0) {
                    System.out.println("Invalid marks. Enter positive values.");
                }
            } while (marks[i][2] < 0);
        }

        // Calculate percentage and grade
        for (int i = 0; i < number; i++) {

            // Calculate percentage from the 2D array
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

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

        // Display the results
        System.out.println("\nStudent Results:");

        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + percentage[i]);
            System.out.println("Grade: " + grade[i]);
        }

        input.close();
    }
}
