package javaString.level2;

import java.util.Scanner;

/**
 * Problem 8 (GCR — Java String Level 2 Assignment)
 * Generate ages of students and check whether each student
 * can vote based on the age being greater than or equal to 18.
 *
 * Author : Mithun
 * Date : 25-09-2026
 */
public class StudentVotingEligibility {

    // Generate random 2-digit ages for students
    public static int[] generateAges(int students) {
        int[] ages = new int[students];

        // Generate ages between 10 and 99
        for (int i = 0; i < students; i++) {
            ages[i] = (int) (Math.random() * 90) + 10;
        }

        return ages;
    }

    // Create age and voting eligibility 2D array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        // Check each student's eligibility
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    // Display the 2D array in tabular format
    public static void displayResult(String[][] result) {

        System.out.printf("%-12s %-15s%n",
                "Age", "Can Vote");

        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-12s %-15s%n",
                    result[i][0], result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number of students
        System.out.print("Enter number of students: ");
        int students = input.nextInt();

        // Generate student ages
        int[] ages = generateAges(students);

        // Check voting eligibility
        String[][] result =
                checkVotingEligibility(ages);

        // Display result
        displayResult(result);

        input.close();
    }
}
