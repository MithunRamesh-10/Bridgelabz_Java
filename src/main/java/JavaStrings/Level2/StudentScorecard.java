package javaString.level2;

import java.util.Scanner;

/**
 * Problem 10 (GCR — Java String Level 2 Assignment)
 * Generate PCM marks for students, calculate total,
 * average, percentage and grade, and display the scorecard.
 *
 * Author : Mithun
 * Date : 25-09-2026
 */
public class StudentGrade {

    // Generate random 2-digit PCM scores
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];

        // Generate Physics, Chemistry and Maths marks
        for (int i = 0; i < students; i++) {
            scores[i][0] = (int) (Math.random() * 90) + 10;
            scores[i][1] = (int) (Math.random() * 90) + 10;
            scores[i][2] = (int) (Math.random() * 90) + 10;
        }

        return scores;
    }

    // Calculate total, average and percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] results =
                new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {

            // Calculate total marks
            int total =
                    scores[i][0]
                            + scores[i][1]
                            + scores[i][2];

            // Calculate average
            double average = (double) total / 3;

            // Calculate percentage
            double percentage =
                    (total * 100.0) / 300;

            // Round values to 2 decimal places
            average =
                    Math.round(average * 100.0) / 100.0;

            percentage =
                    Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    // Calculate grade based on percentage
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

    // Return grades for all students
    public static String[][] calculateGrades(
            double[][] results) {

        String[][] grades =
                new String[results.length][1];

        // Calculate grade for every student
        for (int i = 0; i < results.length; i++) {
            grades[i][0] =
                    getGrade(results[i][2]);
        }

        return grades;
    }

    // Display complete student scorecard
    public static void displayScorecard(
            int[][] scores,
            double[][] results,
            String[][] grades) {

        System.out.printf(
                "%-10s %-10s %-10s %-10s %-10s %-10s %-12s %-6s%n",
                "Student",
                "Physics",
                "Chemistry",
                "Maths",
                "Total",
                "Average",
                "Percentage",
                "Grade"
        );

        for (int i = 0; i < scores.length; i++) {
            System.out.printf(
                    "%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-12.2f %-6s%n",
                    i + 1,
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2],
                    grades[i][0]
            );
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number of students
        System.out.print("Enter number of students: ");
        int students = input.nextInt();

        // Generate PCM scores
        int[][] scores =
                generateScores(students);

        // Calculate total, average and percentage
        double[][] results =
                calculateResults(scores);

        // Calculate grades
        String[][] grades =
                calculateGrades(results);

        // Display scorecard
        displayScorecard(
                scores,
                results,
                grades);

        input.close();
    }
}
