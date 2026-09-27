package javaMethods.level3;

import java.util.Scanner;

/**
 * Problem 12 (GCR — Java Methods Level 3 Assignment)
 * Generate PCM marks for students and calculate total,
 * average, percentage, and grade.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class StudentScorecard {

    // Method to generate random PCM scores
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            // Generate 2-digit marks from 10 to 99
            scores[i][0] = (int) (Math.random() * 90) + 10;
            scores[i][1] = (int) (Math.random() * 90) + 10;
            scores[i][2] = (int) (Math.random() * 90) + 10;
        }

        return scores;
    }

    // Method to calculate total, average and percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            // Calculate total
            int total = scores[i][0]
                    + scores[i][1]
                    + scores[i][2];

            // Calculate average
            double average = (double) total / 3;

            // Calculate percentage
            double percentage = average;

            // Round average and percentage to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    // Method to get grade
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

    // Method to display scorecard
    public static void displayScorecard(
            int[][] scores,
            double[][] results) {

        // Display table heading
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

        // Display student details
        for (int i = 0; i < scores.length; i++) {

            String grade = getGrade(results[i][2]);

            System.out.printf(
                    "%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-12.2f %-6s%n",
                    i + 1,
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2],
                    grade
            );
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number of students
        System.out.print("Enter number of students: ");
        int students = input.nextInt();

        // Generate scores
        int[][] scores = generateScores(students);

        // Calculate results
        double[][] results = calculateResults(scores);

        // Display scorecard
        displayScorecard(scores, results);

        input.close();
    }
}
