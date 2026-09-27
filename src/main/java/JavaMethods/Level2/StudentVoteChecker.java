package javaMethods.level2;

import java.util.Scanner;

/**
 * Problem 7 (GCR — Java Methods Level 2 Assignment)
 * Take the age of 10 students and check whether each
 * student is eligible to vote.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class StudentVoteChecker {

    // Method to check whether a student can vote
    public boolean canStudentVote(int age) {

        // Negative age is invalid
        if (age < 0) {
            return false;
        }

        // Student can vote if age is 18 or above
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create object to call method
        StudentVoteChecker checker = new StudentVoteChecker();

        // Create array for 10 students
        int[] ages = new int[10];

        // Take ages of 10 students
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }

        // Check voting eligibility
        for (int i = 0; i < ages.length; i++) {
            boolean canVote = checker.canStudentVote(ages[i]);

            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        input.close();
    }
}
