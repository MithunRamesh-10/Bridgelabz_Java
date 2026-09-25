package javaMethods.Level3;

import java.util.Random;
import java.util.Scanner;

public class StudentMarks {

    public static int[][] generateMarks(int numberOfStudents) {

        int[][] marks =
                new int[numberOfStudents][3];

        Random random = new Random();

        for (int i = 0; i < numberOfStudents; i++) {

            // Two digit scores: 10 - 99
            marks[i][0] = 10 + random.nextInt(90);
            marks[i][1] = 10 + random.nextInt(90);
            marks[i][2] = 10 + random.nextInt(90);
        }

        return marks;
    }

    public static double[][] calculateResults(
            int[][] marks) {

        double[][] results =
                new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {

            int total =
                    marks[i][0] +
                            marks[i][1] +
                            marks[i][2];

            double average =
                    (double) total / 3;

            double percentage =
                    (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] =
                    Math.round(average * 100) / 100.0;

            results[i][2] =
                    Math.round(percentage * 100) / 100.0;
        }

        return results;
    }

    public static String getGrade(double percentage) {

        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else if (percentage >= 40) {
            return "E";
        } else {
            return "R";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Enter number of students: "
        );

        int numberOfStudents =
                sc.nextInt();

        int[][] marks =
                generateMarks(numberOfStudents);

        double[][] results =
                calculateResults(marks);

        System.out.println(
                "\nStudent\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade"
        );

        for (int i = 0; i < numberOfStudents; i++) {

            System.out.printf(
                    "%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f\t\t%s%n",
                    i + 1,
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2],
                    getGrade(results[i][2])
            );
        }

        sc.close();
    }
}
