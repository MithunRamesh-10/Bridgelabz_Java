package javaArrays.Level2;

import java.util.Scanner;

public class StudentMarksGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number = input.nextInt();

        double[][] marks = new double[number][3];
        double[] percentage = new double[number];
        char[] grade = new char[number];

        for (int i = 0; i < number; i++) {

            System.out.println("\nStudent " + (i + 1));

            for (int j = 0; j < 3; j++) {

                while (true) {

                    if (j == 0) {
                        System.out.print("Enter Physics marks: ");
                    } else if (j == 1) {
                        System.out.print("Enter Chemistry marks: ");
                    } else {
                        System.out.print("Enter Maths marks: ");
                    }

                    double mark = input.nextDouble();

                    if (mark >= 0 && mark <= 100) {
                        marks[i][j] = mark;
                        break;
                    }

                    System.out.println("Invalid marks. Enter marks between 0 and 100.");
                }
            }
        }

        for (int i = 0; i < number; i++) {

            double total = marks[i][0] + marks[i][1] + marks[i][2];

            percentage[i] = (total / 300) * 100;

            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        System.out.println("\nStudent Results:");

        for (int i = 0; i < number; i++) {

            System.out.println("Student " + (i + 1));
            System.out.println("Physics = " + marks[i][0]);
            System.out.println("Chemistry = " + marks[i][1]);
            System.out.println("Maths = " + marks[i][2]);
            System.out.println("Percentage = " + percentage[i] + "%");
            System.out.println("Grade = " + grade[i]);
            System.out.println();
        }

        input.close();
    }
}