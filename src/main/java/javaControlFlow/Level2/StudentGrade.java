package javaControlFlow.level2;

import java.util.Scanner;

/**
 * Problem 3 (GCR — Control Flow Level 2 Assignment)
 * Input marks for Physics, Chemistry and Maths.
 * Compute the percentage and calculate the grade and remarks.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take marks for three subjects
        System.out.print("Enter Physics marks: ");
        double physics = input.nextDouble();

        System.out.print("Enter Chemistry marks: ");
        double chemistry = input.nextDouble();

        System.out.print("Enter Maths marks: ");
        double maths = input.nextDouble();

        // Calculate average marks
        double averageMark = (physics + chemistry + maths) / 3;

        // Define grade and remarks
        String grade;
        String remarks;

        // Calculate grade and remarks
        if (averageMark >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (averageMark >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (averageMark >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (averageMark >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (averageMark >= 40) {
            grade = "E";
            remarks = "Level 1, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Display the result
        System.out.println("Average Mark: " + averageMark);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}
