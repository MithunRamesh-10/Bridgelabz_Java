package javaControlFlow.Level2;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        double physics = input.nextDouble();

        System.out.print("Enter Chemistry marks: ");
        double chemistry = input.nextDouble();

        System.out.print("Enter Maths marks: ");
        double maths = input.nextDouble();

        double average = (physics + chemistry + maths) / 3;

        String grade;
        String remarks;

        if (average >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (average >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (average >= 60) {
            grade = "C";
            remarks = "Level 2, below but approaching agency-normalized standards";
        } else if (average >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (average >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        System.out.println("\nAverage Marks: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}
