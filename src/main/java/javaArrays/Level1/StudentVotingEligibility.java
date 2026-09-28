package javaArrays.level1;

import java.util.Scanner;

/**
 * Problem 1 (GCR — Java Arrays Level 1 Assignment)
 * Take the age of 10 students in an array and check whether each student
 * can vote. A student can vote if the age is 18 or above.
 *
 * Author : Mithun
 * Date : 22-09-2026
 */
public class StudentVotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an array to store ages of 10 students
        int[] ages = new int[10];

        // Take age input for all students
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }

        // Check the voting eligibility of each student
        for (int i = 0; i < ages.length; i++) {

            // Check for invalid negative age
            if (ages[i] < 0) {
                System.out.println("Invalid age: " + ages[i]);
            }
            // Check whether the student can vote
            else if (ages[i] >= 18) {
                System.out.println("The student with the age " +
                        ages[i] + " can vote.");
            }
            // Student cannot vote
            else {
                System.out.println("The student with the age " +
                        ages[i] + " cannot vote.");
            }
        }

        input.close();
    }
}
